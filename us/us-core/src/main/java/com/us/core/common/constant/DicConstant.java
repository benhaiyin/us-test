package com.us.core.common.constant;

 
public class DicConstant
{ 
	
	/**
	 * 用户状态类型
	 *state_type
	 */
	public final static class STATE_TYPE{
		public final static Integer STATE_TYPE_NORMAL=10000100;//正常
		public final static Integer STATE_TYPE_FROZEN=10000200;//冻结
		public final static Integer STATE_TYPE_LOCK=10000300;//锁定
		public final static Integer STATE_TYPE_EXPIRED=10000400;//过期
		public final static Integer STATE_TYPE_NOUSE=10000500;//未启用	//已取消
	}
	
	/**
	 * 用户登录的权限
	 *PRIVILEGE_TYPE
	 */
	public final static class PRIVILEGE_TYPE{
		public final static Integer PRIVILEGE_TYPE_ADMIN=10000210;//平台管理员
		public final static Integer PRIVILEGE_TYPE_OPERATOR=10000220;// 操作员/业务员
		public final static Integer PRIVILEGE_TYPE_CUSTOMER=10000230;//客户
	}
	
}
