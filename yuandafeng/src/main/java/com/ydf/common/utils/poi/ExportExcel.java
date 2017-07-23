package com.ydf.common.utils.poi;

import java.io.FileInputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;


import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/** 
 * 利用开源组件POI3.0.2动态导出EXCEL文档   
 *  
 * @author   wangtao
 * @version v1.0 
 * @param <T> 
 *            应用泛型，代表任意一个符合javabean风格的类 
 *            注意这里为了简单起见，boolean型的属性xxx的get器方式为getXxx(),而不是isXxx() 
 */  
public class ExportExcel<T>  
{  
	   
   /**
    * 根据数据生成excel流（xls类型文件）
    *@author wangtao
    *Apr 1, 2014
    *
    * @param fileTempletPath
    * @param fields
    * @param dataset
    * @param out
    * @throws Exception
    */
   public void exportExcel(String fileTempletPath , String[] fields,  
           Collection<T> dataset, OutputStream out) throws Exception
   {  
	  
       // 声明一个工作薄   
       POIFSFileSystem fs = new POIFSFileSystem( new FileInputStream( fileTempletPath  ) );
       HSSFWorkbook workbook = new HSSFWorkbook(fs);
	  // HSSFWorkbook workbook = new HSSFWorkbook( );
       
       // 取第一个表格   
       HSSFSheet sheet = workbook.getSheetAt(0);  
       
        // 遍历集合数据，产生数据行   
        Iterator<T> it = dataset.iterator();  
        int index = sheet.getPhysicalNumberOfRows(); 
        HSSFRow row = null;
        int rowNum =1;  //序号
        while (it.hasNext())  
        {  
            row  = sheet.createRow(index);  
            T t = (T) it.next();  
            //序号
            row.createCell(0).setCellValue(rowNum++); 
            
            // 利用反射，根据javabean属性的先后顺序，动态调用getXxx()方法得到属性值   
            for (int i = 0; i < fields.length; i++)  
            {  
                HSSFCell cell = row.createCell(i+1);  
                String fieldName = fields[i];
                   //反射取值
                    Object value =  getMethodValue(t, fieldName);
                    // 判断值的类型后进行强制类型转换   
                    Object textValue = getValue(value);  
                      
                    setCellValue(cell , textValue);
                }  
            	index++; 
            } 
           
         
            workbook.write(out);  
            
    }  
  
   /**
    * 根据数据生成excel流（xlsx类型文件）
    *@author wangtao
    *Apr 1, 2014
    *
    * @param templet
    * @param fields
    * @param dataset
    * @param out
    * @throws Exception
    */
    public void exportExcelToXlsx( String templet , String[] fields,  
            Collection<T> dataset, OutputStream out) throws Exception  
    {  
        // 声明一个工作薄   
    	XSSFWorkbook workbook = new XSSFWorkbook(this.getClass().getClassLoader().getResourceAsStream(templet));
        // 取第一个表格   
    	XSSFSheet sheet = workbook.getSheetAt(0);
        
         // 遍历集合数据，产生数据行   
         Iterator<T> it = dataset.iterator();  
         int index = sheet.getPhysicalNumberOfRows();  
         XSSFRow row = null;
         int rowNum =1;  //序号
         while (it.hasNext())  
         {  
             
             row  = sheet.createRow(index);  
             T t = (T) it.next();  
           //序号
             row.createCell(0).setCellValue(rowNum++); 
             
             // 利用反射，根据javabean属性的先后顺序，动态调用getXxx()方法得到属性值   
             for (int i = 0; i < fields.length; i++)  
             {  
            	 XSSFCell cell = row.createCell(i+1);  
                 String fieldName = fields[i];  
                 //反射取值
                 Object value =  getMethodValue(t, fieldName);
                 // 判断值的类型后进行强制类型转换   
                 Object textValue = getValue(value);  
                 //列赋值
                 setCellValue(cell , textValue);
                     
                 }  
             index++; 
         }  
             workbook.write(out);  
         }  
    
    
    /**
     * 带底部的数据  根据数据生成excel流（xls类型文件）
     * @param fileTempletPath 模板文件路径
     * @param fields 
     * @param dataset
     * @param startRow 开始的行号，默认是按 实际物理行号后迭代
     * @param arrFootRow 底部的号数据
     * @param out
     * @throws Exception
     */
    public void exportAndFootExcel(String fileTempletPath , String[] fields,  
            Collection<T> dataset, Integer startRow, List<FootRow> arrFootRow,  OutputStream out) throws Exception
    {  
 	  
        // 声明一个工作薄   
        POIFSFileSystem fs = new POIFSFileSystem( new FileInputStream( fileTempletPath  ) );
        HSSFWorkbook workbook = new HSSFWorkbook(fs);
 	  // HSSFWorkbook workbook = new HSSFWorkbook( );
        
        // 取第一个表格   
        HSSFSheet sheet = workbook.getSheetAt(0);  
        
        int index ;
        		
         // 遍历集合数据，产生数据行   
         Iterator<T> it = dataset.iterator();  
         if(startRow !=null){
        	 index = startRow.intValue();
         }else{
        	 index=	sheet.getPhysicalNumberOfRows(); 
         }
         
         HSSFRow row = null;
         int rowNum =1;  //序号
         while (it.hasNext())  
         {  
        	// sheet.shiftRows(index, sheet.getLastRowNum(), 1,true,false); //吧最后一行易
        	 insertRow(sheet,index, 1);
        	 
             row  = sheet.createRow(index);  
             T t = (T) it.next();  
             //序号
             row.createCell(0).setCellValue(rowNum++); 
             
             // 利用反射，根据javabean属性的先后顺序，动态调用getXxx()方法得到属性值   
             for (int i = 0; i < fields.length; i++)  
             {  
                 HSSFCell cell = row.createCell(i+1);  
                 String fieldName = fields[i];
                    //反射取值
                     Object value =  getMethodValue(t, fieldName);
                     // 判断值的类型后进行强制类型转换   
                     Object textValue = getValue(value);  
                       
                     setCellValue(cell , textValue);
                 }  
             	index++; 
             } 
            
         //底部 添加
          if(arrFootRow !=null && arrFootRow.size()>0){
        	  for(FootRow fRow : arrFootRow){
        		  
        		  if(fRow.getRowNum() != null){
        			  index =  fRow.getRowNum().intValue();
        		  }
        		  
        		  row  = sheet.getRow(index);  
        		  if(row ==null){
        			  insertRow(sheet,index, 1);
        			  row = sheet.createRow(index);
        		  }
        		  //列
        		  List<FootCell> arrFootCell = fRow.getArrFootCell();
        		  if(arrFootCell!=null && arrFootCell.size()>0){
        			  for(FootCell tCell: arrFootCell){
        				  int cellNum = tCell.getCellNum();
        				  Cell cell = row.getCell(cellNum);
        				  if(cell == null ){
        					  cell = row.createCell(cellNum);
        				  }
        				  setCellValue(cell , tCell.getCellVal());
        			  }
        		  }
        		  
        		  
        	  }
        	  
          }
            workbook.write(out);  
             
     }  
    
    /////////////////////////////////////////
   
    /**
     * 插入行
     * @param sheet
     * @param starRow
     * @param rows
     */
    public  void insertRow(HSSFSheet sheet, int starRow,int rows) {

    	  sheet.shiftRows(starRow + 1, sheet.getLastRowNum(), rows,true,false);
    	  
    	  starRow = starRow - 1;

    	  for (int i = 0; i < rows; i++) {

    	   HSSFRow sourceRow = null;
    	   HSSFRow targetRow = null;
    	   HSSFCell sourceCell = null;
    	   HSSFCell targetCell = null;
    	   int m;

    	   starRow = starRow + 1;
    	   sourceRow = sheet.getRow(starRow);
    	   targetRow = sheet.createRow(starRow + 1);
    	   targetRow.setHeight(sourceRow.getHeight());

    	   for (m = sourceRow.getFirstCellNum(); m < sourceRow.getLastCellNum(); m++) {

    	    sourceCell = sourceRow.getCell(m);
    	    targetCell = targetRow.createCell(m);

    	 //   targetCell.setEncoding(sourceCell.getEncoding());
    	    targetCell.setCellStyle(sourceCell.getCellStyle());
    	    targetCell.setCellType(sourceCell.getCellType());
    	    targetCell.setCellValue(sourceCell.getStringCellValue()); //

    	   }
    	  }

    	 }
    
    /**
     * 反射 取值
     *@author wangtao
     *Apr 1, 2014
     *
     * @param obj
     * @param fieldName
     * @return
     * @throws Exception
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
	protected   Object getMethodValue(Object obj,String fieldName) throws Exception{
    	
    	 String getMethodName = "get"  
                 + fieldName.substring(0, 1).toUpperCase()  
                 + fieldName.substring(1);  
             Class tCls = obj.getClass();  
             Method getMethod = tCls.getMethod(getMethodName,  
                     new Class[]  
                     {});  
             Object value = getMethod.invoke(obj, new Object[]  
             {}); 
            return value;
    }
    
    
    protected Object getValue(Object value){
    	Object textValue = "";
    	if(value != null){
	    	if (value instanceof Boolean)  
	        {  
	            boolean bValue = (Boolean) value;  
	            textValue = "是";  
	            if (!bValue)  
	            {  
	                textValue = "否";  
	            }  
	        }  
	        else if (value instanceof Date)  
	        {  
	            Date date = (Date) value;  
	            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
	            textValue = sdf.format(date);  
	        }
	        else if (value instanceof String)  
	        {
	        	String val =(String) value;
	        	textValue = StringUtils.isBlank(val) || "null".equalsIgnoreCase(val) ? "" : val ;
	        }
	        else  
	        {  
	            // 其它数据类型都当作字符串简单处理   
	            textValue = value ;  
	        }
    	}
    	return textValue;
    }
    
    /**
     * XSSFCell
     * @date 2014-8-14 下午3:58:33 
     * @param cell
     * @param value
     */
    protected void   setCellValue(Cell cell , Object value){
    	if(value != null){
    		 if(value instanceof Integer){
    			 cell.setCellValue((Integer)value);
    		 }else if (value instanceof Float) {
				Float floatValue = (Float) value;
				cell.setCellValue(floatValue);
			 } else if (value instanceof Double) {
				Double doubleValue = (Double) value;
				cell.setCellValue(doubleValue);
			} else if (value instanceof Long) {
				Long longValue = (Long) value;
				cell.setCellValue(longValue);
			}else if(value instanceof BigDecimal){
				cell.setCellValue(((BigDecimal) value).doubleValue());
			}
			else{
    			cell.setCellValue(value.toString());
    		}
    	}
    	 
    }
    /**
     * HSSFCell
     * @date 2014-8-14 下午3:58:54 
     * @param cell
     * @param value
     */
    protected void   setCellValue(HSSFCell cell , Object value){
    	if(value != null){
    		 if(value instanceof Integer){
    			 cell.setCellValue((Integer)value);
    		 }else if (value instanceof Float) {
				Float floatValue = (Float) value;
				cell.setCellValue(floatValue);
			 } else if (value instanceof Double) {
				Double doubleValue = (Double) value;
				cell.setCellValue(doubleValue);
			} else if (value instanceof Long) {
				Long longValue = (Long) value;
				cell.setCellValue(longValue);
			}
			else if(value instanceof BigDecimal){
				cell.setCellValue(((BigDecimal) value).doubleValue());
			}
			else{
    			cell.setCellValue(value.toString());
    		}
    	}
    	 
    }
    
    /**
    * @ClassName: StoreReportBean 
    * @Description: TODO 
    * @author zhangting
    * @date 2014年6月9日 
    *
     */
    public void exportExcelByFields(String fileTempletPath , String[] fields,  
            Collection<T> dataset, OutputStream out, String dateFormatter) throws Exception
    {  
 	  
        // 声明一个工作薄   
        POIFSFileSystem fs = new POIFSFileSystem( new FileInputStream( fileTempletPath  ) );
        HSSFWorkbook workbook = new HSSFWorkbook(fs);
 	  // HSSFWorkbook workbook = new HSSFWorkbook( );
        
        // 取第一个表格   
        HSSFSheet sheet = workbook.getSheetAt(0);  
        
         // 遍历集合数据，产生数据行   
         Iterator<T> it = dataset.iterator();  
         int index = sheet.getPhysicalNumberOfRows(); 
         HSSFRow row = null;
         int rowNum =1;  //序号
         while (it.hasNext())  
         {  
             row  = sheet.createRow(index);  
             T t = (T) it.next();  
             //序号
             row.createCell(0).setCellValue(rowNum++); 
             
             // 利用反射，根据javabean属性的先后顺序，动态调用getXxx()方法得到属性值   
             for (int i = 0; i < fields.length; i++)  
             {  
                 HSSFCell cell = row.createCell(i+1);  
                 String fieldName = fields[i];
                    //反射取值
                     Object value =  getMethodValues(t, fieldName);
                     // 判断值的类型后进行强制类型转换   
                     Object textValue = getValue(value, dateFormatter); 
                     setCellValue(cell ,  textValue );
                 }  
             	index++; 
             } 
            
          
             workbook.write(out);  
             
     }  
    /**
     * 反射 取值
     * 如"name, code" 获得值"zhangshan00111"
     * @author zhangting
     * @param o
     * @param proNames
     * @return
     * @throws Exception
     */
    @SuppressWarnings("rawtypes")
	public Object getMethodValues(Object o,String proNames) throws Exception{
        //Method m = o.getClass().getDeclaredMethod("set"+fieldName,new Class[]{String.class});      //没有setName这样会报错
        String retValue = "";
        String fieldNames[] = proNames.split(",");
        for(String fieldName : fieldNames){
            if(fieldName.length() == 1){
                fieldName = fieldName.toUpperCase();
            }else if(fieldName.length() > 1){
                fieldName = fieldName.substring(0,1).toUpperCase() + fieldName.substring(1,fieldName.length());
            }
            Object tempValue = fieldName;
            Method ms[] = o.getClass().getDeclaredMethods();
            if(null != ms && ms.length>0){
                for(Method m : ms){
                    if(m.getName().equals("get"+fieldName)){
                        Class c[] = m.getParameterTypes();
                        if(c.length == 0){
                            tempValue = m.invoke(o);
                            break;
                        }
                    }
                }
            }
            if (tempValue instanceof Date) {
            	return tempValue;
            }else if(fieldNames.length == 1 && tempValue instanceof BigDecimal){
            	return tempValue;
			}else retValue += tempValue;
        }
        return retValue.replaceAll("null", "");
    }
    protected Object getValue(Object value, String dateFormatter){
    	Object textValue = "";
    	if(value != null){
	    	if (value instanceof Boolean)  
	        {  
	            boolean bValue = (Boolean) value;  
	            textValue = "是";  
	            if (!bValue)  
	            {  
	                textValue = "否";  
	            }  
	        }  
	        else if (value instanceof Date)  
	        {  
	            Date date = (Date) value;  
	            if(StringUtils.isNotEmpty(dateFormatter)){
	            	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	            	textValue = sdf.format(date);  
	            }else{
	            	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
	            	textValue = sdf.format(date);  
	            }
	        }
	        else if (value instanceof String)  
	        {
	        	String val =(String) value;
	        	textValue = StringUtils.isBlank(val) || "null".equalsIgnoreCase(val) ? "" : val ;
	        }
	        else if(value instanceof BigDecimal){
				textValue = value;
			}
	        else  
	        {  
	            // 其它数据类型都当作字符串简单处理   
	            textValue = value ;  
	        }
    	}
    	return textValue;
    }
    
}  
