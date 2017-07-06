
DROP TABLE us_account_doc;
CREATE TABLE us_account_doc
(
	account_doc_id       char(22) NOT NULL,
	finance_detail_id    CHAR(22) NULL,
	money                decimal(20,6) NULL,
	money_direction_code bigint(20) NULL,
	money_channel_code   bigint(20) NULL,
	event_time           timestamp NULL,
	company_id           CHAR(22) NULL,
	user_id              CHAR(22) NULL,
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL 
);



ALTER TABLE us_account_doc
ADD PRIMARY KEY (account_doc_id);



CREATE TABLE us_city
(
	city_code            CHAR(10) NOT NULL,
	city_full_name       VARCHAR(22) NULL,
	city_short_name      VARCHAR(22) NULL,
	
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL 
);



ALTER TABLE us_city
ADD PRIMARY KEY (city_code);



CREATE TABLE us_comment
(
	comment_id           CHAR(22) NOT NULL,
	parent_comment_id    CHAR(22) NULL,
	stars                CHAR(22) NULL,
	content              VARCHAR(256) NULL,
	user_id              CHAR(22) NULL,
	order_id             CHAR(22) NULL,
	goods_id             CHAR(22) NULL,
	is_anonymous         int(1) NULL,
	
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL 
);



ALTER TABLE us_comment
ADD PRIMARY KEY (comment_id);



CREATE TABLE us_company
(
	company_id           CHAR(22) NOT NULL,
	business_number      VARCHAR(22) NULL,
	linkman_id           CHAR(22) NULL,
	org_type_code        bigint(20) NULL,
	
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL
);



ALTER TABLE us_company
ADD PRIMARY KEY (company_id);



CREATE TABLE us_company_goods
(
	company_id           CHAR(22) NOT NULL,
	agency_price         DECIMAL(20,6) NULL,
	goods_id             CHAR(22) NOT NULL,
	on_sale              CHAR(22) NULL,
	is_verify            int(1) NULL,
	verify_time          timestamp NULL,
	user_id              CHAR(22) NULL,
	
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL
);



ALTER TABLE us_company_goods
ADD PRIMARY KEY (company_id,goods_id);



CREATE TABLE us_company_info
(
	company_info_id      CHAR(22) NOT NULL,
	company_id           CHAR(22) NULL,
	biz_license_file_id  CHAR(22) NULL,
	currency_code        VARCHAR(22) NULL,
	biz_city_code        CHAR(10) NULL,
	reg_city_code        CHAR(10) NULL,
	biz_street           VARCHAR(22) NULL,
	biz_post             VARCHAR(22) NULL,
	reg_street           VARCHAR(22) NULL,
	money                DECIMAL(20,6) NULL,
	legal_name           VARCHAR(22) NULL,
	legal_identity_code  VARCHAR(22) NULL,
	company_name         VARCHAR(22) NULL,
	version              bigint(20) NULL,
	dustry_code          CHAR(22) NULL,
	
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL
);



ALTER TABLE us_company_info
ADD PRIMARY KEY (company_info_id);



CREATE TABLE us_customer
(
	operator_id			 CHAR(22) NOT NULL,
	company_id           CHAR(22) NOT NULL,
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL
);


CREATE TABLE us_customer_memeber_level
(
	company_id           CHAR(22) NOT NULL,
	operator_id			 CHAR(22) NOT NULL,
	member_level_id      CHAR(22) NOT NULL,
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL
);



CREATE TABLE us_dict
(
	dict_code            bigint(20) NOT NULL,
	description          VARCHAR(50) NULL,
	dict_type            VARCHAR(22) NULL,
	`is_delete`  bigint(20) NULL
);



ALTER TABLE us_dict
ADD PRIMARY KEY (dict_code);



CREATE TABLE us_dir
(
	dir_id               CHAR(22) NOT NULL,
	parent_dir_id        CHAR(22) NULL,
	company_id           CHAR(22) NULL,
	description          CHAR(22) NULL,
	`is_delete`  		 bigint(20) NULL,
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL
);



ALTER TABLE us_dir
ADD PRIMARY KEY (dir_id);



CREATE TABLE us_file
(
	file_id              CHAR(22) NOT NULL,
	url                  CHAR(22) NULL,
	dir_id               CHAR(22) NULL,
	`is_delete`  		 bigint(20) NULL,
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL
);



ALTER TABLE us_file
ADD PRIMARY KEY (file_id);



CREATE TABLE us_finance_detail
(
	finance_detail_id    CHAR(22) NOT NULL,
	order_id             CHAR(22) NULL,
	company_id           CHAR(22) NULL,
	trade_company_id     CHAR(22) NULL,
	money                CHAR(22) NULL,
	money_direction_code CHAR(22) NULL,
	`is_delete`  		 bigint(20) NULL,
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL
);



ALTER TABLE us_finance_detail
ADD PRIMARY KEY (finance_detail_id);



CREATE TABLE us_flow
(
	flow_id              CHAR(22) NOT NULL,
	version              CHAR(22) NULL,
	company_id           CHAR(22) NULL,
	user_id              CHAR(22) NULL,
	is_current           CHAR(22) NULL,
	flow_name            CHAR(22) NULL,
	description          CHAR(22) NULL,
	`is_delete`  		 bigint(20) NULL,
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL
);



ALTER TABLE us_flow
ADD PRIMARY KEY (flow_id);



CREATE TABLE us_flow_node
(
	flow_node_id         CHAR(22) NOT NULL,
	parent_node_id       CHAR(22) NULL,
	description          CHAR(22) NULL,
	hours_limit          CHAR(22) NULL,
	ignore_holiday       CHAR(22) NULL,
	flow_id              CHAR(22) NULL,
	loop_methed_code     CHAR(22) NULL,
	`is_delete`  		 bigint(20) NULL,
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL
);



ALTER TABLE us_flow_node
ADD PRIMARY KEY (flow_node_id);



CREATE TABLE us_goods
(
	goods_id             CHAR(22) NOT NULL,
	goods_name           CHAR(22) NULL,
	description          CHAR(22) NULL,
	goods_type_code      CHAR(22) NULL,
	view_price           CHAR(22) NULL,
	view_agency_price    CHAR(22) NULL,
	goods_code           CHAR(22) NULL,
	advance_payment      CHAR(22) NULL,
	is_verify            CHAR(22) NULL,
	on_sale              CHAR(22) NULL,
	is_agent_able        CHAR(22) NULL,
	user_id              CHAR(22) NULL,
	
	update_time          CHAR(22) NULL,
	unit                 CHAR(22) NULL,
	stock_quantity       CHAR(22) NULL,
	allow_oversell       CHAR(22) NULL,
	price                CHAR(22) NULL,
	kickback             CHAR(22) NULL,
	company_id           CHAR(22) NULL,
	count_base           CHAR(22) NULL,
	desc_abstract        CHAR(22) NULL,
	`is_delete`  		 bigint(20) NULL,
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL
);



ALTER TABLE us_goods
ADD PRIMARY KEY (goods_id);



CREATE TABLE us_goods_attr
(
	goods_attr_id        CHAR(22) NOT NULL,
	attr_name            CHAR(22) NULL,
	goods_id             CHAR(22) NOT NULL,
	`sequence`             CHAR(22) NULL,
	unit                 CHAR(22) NULL,
	is_price_factor      CHAR(22) NULL,
	value_method_code    CHAR(22) NULL,
	`is_delete`  		 bigint(20) NULL,
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL
);



ALTER TABLE us_goods_attr
ADD PRIMARY KEY (goods_attr_id);



CREATE TABLE us_goods_attr_enum
(
	attr_enum_id         CHAR(22) NOT NULL,
	is_view              CHAR(22) NULL,
	`value`               CHAR(22) NULL,
	goods_attr_id        CHAR(22) NULL,
	`is_delete`  		 bigint(20) NULL,
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL
);



ALTER TABLE us_goods_attr_enum
ADD PRIMARY KEY (attr_enum_id);



CREATE TABLE us_goods_city
(
	city_code            CHAR(22) NOT NULL,
	company_id           CHAR(22) NOT NULL,
	goods_id             CHAR(22) NOT NULL,
	user_id              CHAR(22) NULL,
	`is_delete`  		 bigint(20) NULL,
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL
);



ALTER TABLE us_goods_city
ADD PRIMARY KEY (city_code,company_id,goods_id);



CREATE TABLE us_goods_flow
(
	flow_id              CHAR(22) NOT NULL,
	goods_id             CHAR(22) NOT NULL,
	is_public            CHAR(22) NULL,
	`is_delete`  		 bigint(20) NULL,
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL
);



ALTER TABLE us_goods_flow
ADD PRIMARY KEY (flow_id,goods_id);



CREATE TABLE us_goods_image
(
	file_id              CHAR(22) NOT NULL,
	goods_id             CHAR(22) NOT NULL,
	sequence             CHAR(22) NULL,
	`is_delete`  		 bigint(20) NULL,
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL
);



ALTER TABLE us_goods_image
ADD PRIMARY KEY (file_id,goods_id);



CREATE TABLE us_goods_tag
(
	tag_id               CHAR(22) NOT NULL,
	goods_id             CHAR(22) NOT NULL,
	user_id              CHAR(22) NULL,
	`is_delete`  		 bigint(20) NULL,
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL
);



ALTER TABLE us_goods_tag
ADD PRIMARY KEY (tag_id,goods_id);



CREATE TABLE us_industry
(
	dustry_code          CHAR(22) NOT NULL,
	dustry_parent_code   CHAR(22) NULL,
	enabled              CHAR(22) NULL,
	`is_delete`  		 bigint(20) NULL,
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL
);



ALTER TABLE us_industry
ADD PRIMARY KEY (dustry_code);



CREATE TABLE us_invoice
(
	invoice_id           CHAR(22) NOT NULL,
	company              CHAR(22) NULL,
	tax_code             CHAR(22) NULL,
	address              CHAR(22) NULL,
	bank                 CHAR(22) NULL,
	bank_account         CHAR(22) NULL,
	user_id              CHAR(22) NULL,
	`is_delete`  		 bigint(20) NULL,
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL
);



ALTER TABLE us_invoice
ADD PRIMARY KEY (invoice_id);



CREATE TABLE us_issue
(
	issue_id             CHAR(22) NOT NULL,
	plan_time            CHAR(22) NULL,
	user_id              CHAR(22) NULL,
	description          CHAR(22) NULL,
	task_status_code     CHAR(22) NULL,
	company_id           CHAR(22) NULL,
	order_id             CHAR(22) NULL,
	goods_id             CHAR(22) NULL,
	flow_node_id         CHAR(22) NULL,
	`is_delete`  		 bigint(20) NULL,
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL
);



ALTER TABLE us_issue
ADD PRIMARY KEY (issue_id);



CREATE TABLE us_issue_done
(
	issue_done_id        CHAR(22) NOT NULL,
	issue_id             CHAR(22) NULL,
	description          CHAR(22) NULL,
	user_id              CHAR(22) NULL,
	done_time            CHAR(22) NULL,
	`is_delete`  		 bigint(20) NULL,
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL
);



ALTER TABLE us_issue_done
ADD PRIMARY KEY (issue_done_id);



CREATE TABLE us_issue_done_attach
(
	issue_done_id        CHAR(22) NOT NULL,
	file_id              CHAR(22) NOT NULL,
	`is_delete`  		 bigint(20) NULL,
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL
);



ALTER TABLE us_issue_done_attach
ADD PRIMARY KEY (issue_done_id,file_id);



CREATE TABLE us_member_level
(
	member_level_id      CHAR(22) NOT NULL,
	level_name           CHAR(22) NULL,
	description          CHAR(22) NULL,
	company_id           CHAR(22) NULL,
	`sequence`            CHAR(22) NULL,
	`is_delete`  		 bigint(20) NULL,
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL
);



ALTER TABLE us_member_level
ADD PRIMARY KEY (member_level_id);



CREATE TABLE us_menu
(
	menu_id              CHAR(22) NOT NULL,
	parent_menu_id       CHAR(22) NULL,
	url                  CHAR(22) NULL,
	banner_html          CHAR(22) NULL,
	`sequence`             CHAR(22) NULL,
	`is_delete`  		 bigint(20) NULL,
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL
);



ALTER TABLE us_menu
ADD PRIMARY KEY (menu_id);



CREATE TABLE us_menu_auth
(
	company_id           CHAR(22) NOT NULL,
	menu_id              CHAR(22) NOT NULL,
	`is_delete`  		 bigint(20) NULL,
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL
);



ALTER TABLE us_menu_auth
ADD PRIMARY KEY (company_id,menu_id);



CREATE TABLE us_menu_goods
(
	menu_id              CHAR(22) NOT NULL,
	goods_id             CHAR(22) NOT NULL,
	`sequence`             CHAR(22) NULL,
	`is_delete`  		 bigint(20) NULL,
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL
);



ALTER TABLE us_menu_goods
ADD PRIMARY KEY (menu_id,goods_id);



CREATE TABLE us_message
(
	message_id           CHAR(22) NOT NULL,
	user_id              CHAR(22) NULL,
	content              CHAR(22) NULL,
	dict_code            CHAR(22) NULL,
	`is_delete`  		 bigint(20) NULL,
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL
);



ALTER TABLE us_message
ADD PRIMARY KEY (message_id);



CREATE TABLE us_message_subscribe
(
	dict_code            CHAR(22) NOT NULL,
	company_id           CHAR(22) NOT NULL,
	`is_delete`  		 bigint(20) NULL,
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL
);



ALTER TABLE us_message_subscribe
ADD PRIMARY KEY (company_id,dict_code);



CREATE TABLE us_operator
(
	company_id           CHAR(22) NOT NULL,
	city_code            CHAR(22) NULL,
	platform_name        CHAR(22) NULL,
	file_id              CHAR(22) NULL,
	is_main_operator     CHAR(22) NULL,
	operator_code        CHAR(22) NULL,
	`is_delete`  		 bigint(20) NULL,
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL
);



ALTER TABLE us_operator
ADD PRIMARY KEY (company_id);



CREATE TABLE us_order
(
	order_id             CHAR(22) NOT NULL,
	contract_money       CHAR(22) NULL,
	order_status_code    CHAR(22) NULL,
	balance_money        CHAR(22) NULL,
	company_id           CHAR(22) NULL,
	order_code           CHAR(22) NULL,
	user_id              CHAR(22) NULL,
	advance_payment      CHAR(22) NULL,
	`is_delete`  		 bigint(20) NULL,
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL
);



ALTER TABLE us_order
ADD PRIMARY KEY (order_id);



CREATE TABLE us_order_goods
(
	order_id             CHAR(22) NOT NULL,
	goods_id             CHAR(22) NOT NULL,
	price                CHAR(22) NULL,
	sub_money            CHAR(22) NULL,
	amount               CHAR(22) NULL,
	company_id           CHAR(22) NULL,
	advance_payment      CHAR(22) NULL,
	`is_delete`  		 bigint(20) NULL,
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL
);



ALTER TABLE us_order_goods
ADD PRIMARY KEY (order_id,goods_id);



CREATE TABLE us_order_goods_attr
(
	order_id             CHAR(22) NOT NULL,
	goods_id             CHAR(22) NOT NULL,
	goods_attr_id        CHAR(22) NOT NULL,
	attr_name            CHAR(22) NULL,
	attr_value           CHAR(22) NULL,
	unit                 CHAR(22) NULL,
	dict_code            CHAR(22) NULL,
	`sequence`             CHAR(22) NULL,
	`is_delete`  		 bigint(20) NULL,
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL
);



ALTER TABLE us_order_goods_attr
ADD PRIMARY KEY (order_id,goods_id,goods_attr_id);



CREATE TABLE us_order_invoice
(
	order_invoice_id     CHAR(22) NOT NULL,
	invoice_id           CHAR(22) NULL,
	order_id             CHAR(22) NULL,
	company_id           CHAR(22) NULL,
	user_id              CHAR(22) NULL,
	invoice_code         CHAR(22) NULL,
	dict_code            CHAR(22) NULL,
	money                CHAR(22) NULL,
	`is_delete`  		 bigint(20) NULL,
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL
);



ALTER TABLE us_order_invoice
ADD PRIMARY KEY (order_invoice_id);



CREATE TABLE us_order_invoice_item
(
	invoice_item_id      CHAR(22) NOT NULL,
	goods_name           CHAR(22) NULL,
	amount               CHAR(22) NULL,
	non_tax_price        CHAR(22) NULL,
	order_invoice_id     CHAR(22) NULL,
	`is_delete`  		 bigint(20) NULL,
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL
);



ALTER TABLE us_order_invoice_item
ADD PRIMARY KEY (invoice_item_id);



CREATE TABLE us_recommand
(
	company_id           CHAR(22) NOT NULL,
	goods_id             CHAR(22) NOT NULL,
	recommand_sort       CHAR(22) NULL,
	enabled              CHAR(22) NULL,
	user_id              CHAR(22) NULL,
	update_time          CHAR(22) NULL,
	`is_delete`  		 bigint(20) NULL,
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL
);



ALTER TABLE us_recommand
ADD PRIMARY KEY (company_id,goods_id);



CREATE TABLE us_sell_link
(
	goods_id             CHAR(22) NOT NULL,
	sell_link_code       CHAR(22) NULL,
	`is_delete`  		 bigint(20) NULL,
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL
);



ALTER TABLE us_sell_link
ADD PRIMARY KEY (goods_id);



CREATE TABLE us_shareholder
(
	shareholder_id       CHAR(22) NOT NULL,
	shareholder_name     CHAR(22) NULL,
	is_org               CHAR(22) NULL,
	percent              CHAR(22) NULL,
	money                CHAR(22) NULL,
	company_id           CHAR(22) NULL,
	update_time          CHAR(22) NULL,
	`is_delete`  		 bigint(20) NULL,
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL
);



ALTER TABLE us_shareholder
ADD PRIMARY KEY (shareholder_id);



CREATE TABLE us_tag
(
	tag_id               CHAR(22) NOT NULL,
	tag_desc             CHAR(22) NULL,
	company_id           CHAR(22) NULL,
	user_id              CHAR(22) NULL,
	update_time          CHAR(22) NULL,
	`is_delete`  		 bigint(20) NULL,
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL
);



ALTER TABLE us_tag
ADD PRIMARY KEY (tag_id);



CREATE TABLE us_user
(
	user_id              CHAR(22) NOT NULL,
	mobile               CHAR(22) NULL,
	name                 CHAR(22) NULL,
	email                CHAR(22) NULL,
	is_admin             CHAR(22) NULL,
	password             CHAR(22) NULL,
	disabled             CHAR(22) NULL,
	company_id           CHAR(22) NULL,
	qq                   CHAR(22) NULL,
	`is_delete`  		 bigint(20) NULL,
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL
);



ALTER TABLE us_user
ADD PRIMARY KEY (user_id);



CREATE TABLE us_widget
(
	widget_id            CHAR(22) NOT NULL,
	widget_name          CHAR(22) NULL,
	widget_description   CHAR(22) NULL,
	file_id              CHAR(22) NULL,
	dict_code            CHAR(22) NULL,
	`is_delete`  		 bigint(20) NULL,
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL
);



ALTER TABLE us_widget
ADD PRIMARY KEY (widget_id);



CREATE TABLE us_widget_user
(
	user_id              CHAR(22) NOT NULL,
	widget_id            CHAR(22) NOT NULL,
	cancle_time          CHAR(22) NULL,
	`is_delete`  		 bigint(20) NULL,
	`creater`  			 char(22)  NULL ,
	`create_time`        timestamp NULL ,
	`modifier`           char(22)  NULL ,
	`modify_time`        timestamp NULL ,
	`ver`                bigint(20) NULL
);



alter TABLE us_account_doc COMMENT = '会计凭证'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_account_doc MODIFY COLUMN  `account_doc_id` CHAR(22) NOT NULL COMMENT '会计凭证ID';
      ALTER TABLE us_account_doc MODIFY COLUMN  `finance_detail_id` CHAR(22) NULL COMMENT '应收应付明细ID';
      ALTER TABLE us_account_doc MODIFY COLUMN  `money` CHAR(22) NULL COMMENT '金额';
      ALTER TABLE us_account_doc MODIFY COLUMN  `money_direction_code` CHAR(22) NULL COMMENT '资金方向ID';
      ALTER TABLE us_account_doc MODIFY COLUMN  `money_channel_code` CHAR(22) NULL COMMENT '资金渠道ID';
      ALTER TABLE us_account_doc MODIFY COLUMN  `create_time` CHAR(22) NULL COMMENT '创建时间';
      ALTER TABLE us_account_doc MODIFY COLUMN  `event_time` CHAR(22) NULL COMMENT '发生时间';
      ALTER TABLE us_account_doc MODIFY COLUMN  `company_id` CHAR(22) NULL COMMENT '公司ID';
      ALTER TABLE us_account_doc MODIFY COLUMN  `user_id` CHAR(22) NULL COMMENT '用户ID';
      
alter TABLE us_city COMMENT = '城市'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_city MODIFY COLUMN  `city_code` CHAR(22) NOT NULL COMMENT '城市编码';
      ALTER TABLE us_city MODIFY COLUMN  `city_full_name` CHAR(22) NULL COMMENT '全名';
      ALTER TABLE us_city MODIFY COLUMN  `city_short_name` CHAR(22) NULL COMMENT '短名';
      
alter TABLE us_comment COMMENT = '订单评价'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_comment MODIFY COLUMN  `comment_id` CHAR(22) NOT NULL COMMENT '订单评价ID';
      ALTER TABLE us_comment MODIFY COLUMN  `parent_comment_id` CHAR(22) NULL COMMENT '父评价ID';
      ALTER TABLE us_comment MODIFY COLUMN  `stars` CHAR(22) NULL COMMENT '分数';
      ALTER TABLE us_comment MODIFY COLUMN  `content` CHAR(22) NULL COMMENT '内容';
      ALTER TABLE us_comment MODIFY COLUMN  `create_time` CHAR(22) NULL COMMENT '创建时间';
      ALTER TABLE us_comment MODIFY COLUMN  `user_id` CHAR(22) NULL COMMENT '评价用户ID';
      ALTER TABLE us_comment MODIFY COLUMN  `order_id` CHAR(22) NULL COMMENT '订单ID';
      ALTER TABLE us_comment MODIFY COLUMN  `goods_id` CHAR(22) NULL COMMENT '产品ID';
      ALTER TABLE us_comment MODIFY COLUMN  `is_anonymous` CHAR(22) NULL COMMENT 'is匿名';
      
alter TABLE us_company COMMENT = '公司'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_company MODIFY COLUMN  `company_id` CHAR(22) NOT NULL COMMENT '公司ID';
      ALTER TABLE us_company MODIFY COLUMN  `business_number` CHAR(22) NULL COMMENT '社会统一代码';
      ALTER TABLE us_company MODIFY COLUMN  `create_time` CHAR(22) NULL COMMENT '创建时间';
      ALTER TABLE us_company MODIFY COLUMN  `linkman_id` CHAR(22) NULL COMMENT '联系人ID';
      ALTER TABLE us_company MODIFY COLUMN  `org_type_code` CHAR(22) NULL COMMENT '组织类型ID';
      
alter TABLE us_company_goods COMMENT = '代理产品'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_company_goods MODIFY COLUMN  `company_id` CHAR(22) NOT NULL COMMENT '运营商ID';
      ALTER TABLE us_company_goods MODIFY COLUMN  `goods_id` CHAR(22) NOT NULL COMMENT '产品ID';
      ALTER TABLE us_company_goods MODIFY COLUMN  `agency_price` CHAR(22) NULL COMMENT '代理结算单价';
      ALTER TABLE us_company_goods MODIFY COLUMN  `on_sale` CHAR(22) NULL COMMENT 'is上架';
      ALTER TABLE us_company_goods MODIFY COLUMN  `is_verify` CHAR(22) NULL COMMENT 'is审核';
      ALTER TABLE us_company_goods MODIFY COLUMN  `verify_time` CHAR(22) NULL COMMENT '审核时间';
      ALTER TABLE us_company_goods MODIFY COLUMN  `user_id` CHAR(22) NULL COMMENT '审核用户ID';
      ALTER TABLE us_company_goods MODIFY COLUMN  `create_time` CHAR(22) NULL COMMENT '创建时间';
      
alter TABLE us_company_info COMMENT = '公司信息'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_company_info MODIFY COLUMN  `company_info_id` CHAR(22) NOT NULL COMMENT '公司信息ID';
      ALTER TABLE us_company_info MODIFY COLUMN  `company_id` CHAR(22) NULL COMMENT '公司ID';
      ALTER TABLE us_company_info MODIFY COLUMN  `biz_license_file_id` CHAR(22) NULL COMMENT '营业执照ID';
      ALTER TABLE us_company_info MODIFY COLUMN  `currency_code` CHAR(22) NULL COMMENT '注册资金币种ID';
      ALTER TABLE us_company_info MODIFY COLUMN  `biz_city_code` CHAR(22) NULL COMMENT '经营地城市编码';
      ALTER TABLE us_company_info MODIFY COLUMN  `reg_city_code` CHAR(22) NULL COMMENT '注册地城市编码';
      ALTER TABLE us_company_info MODIFY COLUMN  `biz_street` CHAR(22) NULL COMMENT '经营地详细地址';
      ALTER TABLE us_company_info MODIFY COLUMN  `biz_post` CHAR(22) NULL COMMENT '经营地邮政编码';
      ALTER TABLE us_company_info MODIFY COLUMN  `reg_street` CHAR(22) NULL COMMENT '注册地详细地址';
      ALTER TABLE us_company_info MODIFY COLUMN  `money` CHAR(22) NULL COMMENT '注册资金-元';
      ALTER TABLE us_company_info MODIFY COLUMN  `legal_name` CHAR(22) NULL COMMENT '法人姓名';
      ALTER TABLE us_company_info MODIFY COLUMN  `legal_identity_code` CHAR(22) NULL COMMENT '法人身份证号码';
      ALTER TABLE us_company_info MODIFY COLUMN  `company_name` CHAR(22) NULL COMMENT '公司名称';
      ALTER TABLE us_company_info MODIFY COLUMN  `version` CHAR(22) NULL COMMENT '版本';
      ALTER TABLE us_company_info MODIFY COLUMN  `dustry_code` CHAR(22) NULL COMMENT '行业编码';
      
alter TABLE us_customer COMMENT = '客户'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_customer MODIFY COLUMN  `company_id` CHAR(22) NOT NULL COMMENT '公司ID';
      ALTER TABLE us_customer MODIFY COLUMN  `create_time` CHAR(22) NULL COMMENT '创建时间';
      
alter TABLE us_customer_memeber_level COMMENT = '客户-会员等级'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_customer_memeber_level MODIFY COLUMN  `company_id` CHAR(22) NOT NULL COMMENT '公司ID';
      ALTER TABLE us_customer_memeber_level MODIFY COLUMN  `member_level_id` CHAR(22) NOT NULL COMMENT '会员等级ID';
      
alter TABLE us_dict COMMENT = '数据字典'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_dict MODIFY COLUMN  `dict_code` CHAR(22) NOT NULL COMMENT '字典编码';
      ALTER TABLE us_dict MODIFY COLUMN  `description` CHAR(22) NULL COMMENT '描述';
      ALTER TABLE us_dict MODIFY COLUMN  `dict_type` CHAR(22) NULL COMMENT '类型编码';
      
alter TABLE us_dir COMMENT = '目录'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_dir MODIFY COLUMN  `dir_id` CHAR(22) NOT NULL COMMENT '目录ID';
      ALTER TABLE us_dir MODIFY COLUMN  `parent_dir_id` CHAR(22) NULL COMMENT '名称';
      ALTER TABLE us_dir MODIFY COLUMN  `description` CHAR(22) NULL COMMENT 'description';
      ALTER TABLE us_dir MODIFY COLUMN  `company_id` CHAR(22) NULL COMMENT '公司ID';
      
alter TABLE us_file COMMENT = '文件'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_file MODIFY COLUMN  `file_id` CHAR(22) NOT NULL COMMENT '文件ID';
      ALTER TABLE us_file MODIFY COLUMN  `url` CHAR(22) NULL COMMENT 'URL';
      ALTER TABLE us_file MODIFY COLUMN  `dir_id` CHAR(22) NULL COMMENT '目录ID';
      
alter TABLE us_finance_detail COMMENT = '应收应付明细'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_finance_detail MODIFY COLUMN  `finance_detail_id` CHAR(22) NOT NULL COMMENT '应收应付明细ID';
      ALTER TABLE us_finance_detail MODIFY COLUMN  `order_id` CHAR(22) NULL COMMENT '订单ID';
      ALTER TABLE us_finance_detail MODIFY COLUMN  `company_id` CHAR(22) NULL COMMENT '公司ID';
      ALTER TABLE us_finance_detail MODIFY COLUMN  `trade_company_id` CHAR(22) NULL COMMENT '对方公司ID';
      ALTER TABLE us_finance_detail MODIFY COLUMN  `money` CHAR(22) NULL COMMENT '金额';
      ALTER TABLE us_finance_detail MODIFY COLUMN  `create_time` CHAR(22) NULL COMMENT '创建时间';
      ALTER TABLE us_finance_detail MODIFY COLUMN  `money_direction_code` CHAR(22) NULL COMMENT '资金方向ID';
      
alter TABLE us_flow COMMENT = '交付流程'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_flow MODIFY COLUMN  `flow_id` CHAR(22) NOT NULL COMMENT '交付流程ID';
      ALTER TABLE us_flow MODIFY COLUMN  `version` CHAR(22) NULL COMMENT '版本号';
      ALTER TABLE us_flow MODIFY COLUMN  `company_id` CHAR(22) NULL COMMENT '运营商ID';
      ALTER TABLE us_flow MODIFY COLUMN  `user_id` CHAR(22) NULL COMMENT '用户ID';
      ALTER TABLE us_flow MODIFY COLUMN  `create_time` CHAR(22) NULL COMMENT '创建时间';
      ALTER TABLE us_flow MODIFY COLUMN  `is_current` CHAR(22) NULL COMMENT 'isCur';
      ALTER TABLE us_flow MODIFY COLUMN  `flow_name` CHAR(22) NULL COMMENT '流程名称';
      ALTER TABLE us_flow MODIFY COLUMN  `description` CHAR(22) NULL COMMENT '流程描述';
      
alter TABLE us_flow_node COMMENT = '流程节点'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_flow_node MODIFY COLUMN  `flow_node_id` CHAR(22) NOT NULL COMMENT '流程节点ID';
      ALTER TABLE us_flow_node MODIFY COLUMN  `parent_node_id` CHAR(22) NULL COMMENT '节点名称';
      ALTER TABLE us_flow_node MODIFY COLUMN  `description` CHAR(22) NULL COMMENT '节点描述';
      ALTER TABLE us_flow_node MODIFY COLUMN  `hours_limit` CHAR(22) NULL COMMENT '小时数限定';
      ALTER TABLE us_flow_node MODIFY COLUMN  `ignore_holiday` CHAR(22) NULL COMMENT 'is节假日顺延';
      ALTER TABLE us_flow_node MODIFY COLUMN  `flow_id` CHAR(22) NULL COMMENT '交付流程ID';
      ALTER TABLE us_flow_node MODIFY COLUMN  `loop_methed_code` CHAR(22) NULL COMMENT '循环方式ID';
      
alter TABLE us_goods COMMENT = '产品'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_goods MODIFY COLUMN  `goods_id` CHAR(22) NOT NULL COMMENT '产品ID';
      ALTER TABLE us_goods MODIFY COLUMN  `goods_name` CHAR(22) NULL COMMENT '产品名称';
      ALTER TABLE us_goods MODIFY COLUMN  `description` CHAR(22) NULL COMMENT '产品描述';
      ALTER TABLE us_goods MODIFY COLUMN  `goods_type_code` CHAR(22) NULL COMMENT '产品类型ID';
      ALTER TABLE us_goods MODIFY COLUMN  `view_price` CHAR(22) NULL COMMENT '显示单价';
      ALTER TABLE us_goods MODIFY COLUMN  `view_agency_price` CHAR(22) NULL COMMENT '显示代理价';
      ALTER TABLE us_goods MODIFY COLUMN  `goods_code` CHAR(22) NULL COMMENT '产品编号';
      ALTER TABLE us_goods MODIFY COLUMN  `advance_payment` CHAR(22) NULL COMMENT '定金';
      ALTER TABLE us_goods MODIFY COLUMN  `is_verify` CHAR(22) NULL COMMENT 'is审核';
      ALTER TABLE us_goods MODIFY COLUMN  `on_sale` CHAR(22) NULL COMMENT 'is上架';
      ALTER TABLE us_goods MODIFY COLUMN  `is_agent_able` CHAR(22) NULL COMMENT 'is接受代理';
      ALTER TABLE us_goods MODIFY COLUMN  `user_id` CHAR(22) NULL COMMENT '用户ID';
      ALTER TABLE us_goods MODIFY COLUMN  `create_time` CHAR(22) NULL COMMENT '创建时间';
      ALTER TABLE us_goods MODIFY COLUMN  `update_time` CHAR(22) NULL COMMENT '更新时间';
      ALTER TABLE us_goods MODIFY COLUMN  `unit` CHAR(22) NULL COMMENT '计量单位';
      ALTER TABLE us_goods MODIFY COLUMN  `stock_quantity` CHAR(22) NULL COMMENT '库存数量';
      ALTER TABLE us_goods MODIFY COLUMN  `allow_oversell` CHAR(22) NULL COMMENT 'is允许补货';
      ALTER TABLE us_goods MODIFY COLUMN  `price` CHAR(22) NULL COMMENT '交易单价';
      ALTER TABLE us_goods MODIFY COLUMN  `kickback` CHAR(22) NULL COMMENT '返现';
      ALTER TABLE us_goods MODIFY COLUMN  `company_id` CHAR(22) NULL COMMENT '供应商ID';
      ALTER TABLE us_goods MODIFY COLUMN  `count_base` CHAR(22) NULL COMMENT '已售起始值';
      ALTER TABLE us_goods MODIFY COLUMN  `desc_abstract` CHAR(22) NULL COMMENT '产品描述摘要';
      
alter TABLE us_goods_attr COMMENT = '产品属性'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_goods_attr MODIFY COLUMN  `goods_attr_id` CHAR(22) NOT NULL COMMENT '产品属性ID';
      ALTER TABLE us_goods_attr MODIFY COLUMN  `attr_name` CHAR(22) NULL COMMENT '属性名';
      ALTER TABLE us_goods_attr MODIFY COLUMN  `goods_id` CHAR(22) NOT NULL COMMENT '产品ID';
      ALTER TABLE us_goods_attr MODIFY COLUMN  `sequence` CHAR(22) NULL COMMENT '属性顺序';
      ALTER TABLE us_goods_attr MODIFY COLUMN  `unit` CHAR(22) NULL COMMENT '计量单位';
      ALTER TABLE us_goods_attr MODIFY COLUMN  `is_price_factor` CHAR(22) NULL COMMENT 'is价格相关';
      ALTER TABLE us_goods_attr MODIFY COLUMN  `value_method_code` CHAR(22) NULL COMMENT '计价方式ID';
      
alter TABLE us_goods_attr_enum COMMENT = '属性枚举值'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_goods_attr_enum MODIFY COLUMN  `attr_enum_id` CHAR(22) NOT NULL COMMENT '属性枚举值ID';
      ALTER TABLE us_goods_attr_enum MODIFY COLUMN  `is_view` CHAR(22) NULL COMMENT '显示';
      ALTER TABLE us_goods_attr_enum MODIFY COLUMN  `value` CHAR(22) NULL COMMENT '值';
      ALTER TABLE us_goods_attr_enum MODIFY COLUMN  `goods_attr_id` CHAR(22) NULL COMMENT '产品属性ID';
      
alter TABLE us_goods_city COMMENT = '产品-发行地区'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_goods_city MODIFY COLUMN  `city_code` CHAR(22) NOT NULL COMMENT '城市编码';
      ALTER TABLE us_goods_city MODIFY COLUMN  `company_id` CHAR(22) NOT NULL COMMENT '运营商ID';
      ALTER TABLE us_goods_city MODIFY COLUMN  `goods_id` CHAR(22) NOT NULL COMMENT '产品ID';
      ALTER TABLE us_goods_city MODIFY COLUMN  `create_time` CHAR(22) NULL COMMENT '创建时间';
      ALTER TABLE us_goods_city MODIFY COLUMN  `user_id` CHAR(22) NULL COMMENT '用户ID';
      
alter TABLE us_goods_flow COMMENT = '产品-交付流程'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_goods_flow MODIFY COLUMN  `flow_id` CHAR(22) NOT NULL COMMENT '交付流程ID';
      ALTER TABLE us_goods_flow MODIFY COLUMN  `goods_id` CHAR(22) NOT NULL COMMENT '产品ID';
      ALTER TABLE us_goods_flow MODIFY COLUMN  `is_public` CHAR(22) NULL COMMENT 'is公开';
      
alter TABLE us_goods_image COMMENT = '产品图片'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_goods_image MODIFY COLUMN  `file_id` CHAR(22) NOT NULL COMMENT '文件ID';
      ALTER TABLE us_goods_image MODIFY COLUMN  `goods_id` CHAR(22) NOT NULL COMMENT '产品ID';
      ALTER TABLE us_goods_image MODIFY COLUMN  `sequence` CHAR(22) NULL COMMENT '图片顺序';
      
alter TABLE us_goods_tag COMMENT = '产品-产品标签'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_goods_tag MODIFY COLUMN  `tag_id` CHAR(22) NOT NULL COMMENT '产品标签ID';
      ALTER TABLE us_goods_tag MODIFY COLUMN  `goods_id` CHAR(22) NOT NULL COMMENT '产品ID';
      ALTER TABLE us_goods_tag MODIFY COLUMN  `user_id` CHAR(22) NULL COMMENT '用户ID';
      ALTER TABLE us_goods_tag MODIFY COLUMN  `create_time` CHAR(22) NULL COMMENT '创建时间';
      
alter TABLE us_industry COMMENT = '行业'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_industry MODIFY COLUMN  `dustry_code` CHAR(22) NOT NULL COMMENT '行业编码';
      ALTER TABLE us_industry MODIFY COLUMN  `dustry_parent_code` CHAR(22) NULL COMMENT '名称';
      ALTER TABLE us_industry MODIFY COLUMN  `enabled` CHAR(22) NULL COMMENT 'is启用';
      
alter TABLE us_invoice COMMENT = '常用发票信息'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_invoice MODIFY COLUMN  `invoice_id` CHAR(22) NOT NULL COMMENT '常用发票信息ID';
      ALTER TABLE us_invoice MODIFY COLUMN  `company` CHAR(22) NULL COMMENT '公司名称';
      ALTER TABLE us_invoice MODIFY COLUMN  `tax_code` CHAR(22) NULL COMMENT '税号';
      ALTER TABLE us_invoice MODIFY COLUMN  `address` CHAR(22) NULL COMMENT '地址';
      ALTER TABLE us_invoice MODIFY COLUMN  `bank` CHAR(22) NULL COMMENT '开户行';
      ALTER TABLE us_invoice MODIFY COLUMN  `bank_account` CHAR(22) NULL COMMENT '账号';
      ALTER TABLE us_invoice MODIFY COLUMN  `user_id` CHAR(22) NULL COMMENT '用户ID';
      
alter TABLE us_issue COMMENT = '工作任务'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_issue MODIFY COLUMN  `issue_id` CHAR(22) NOT NULL COMMENT '工作任务ID';
      ALTER TABLE us_issue MODIFY COLUMN  `plan_time` CHAR(22) NULL COMMENT '要求执行日期';
      ALTER TABLE us_issue MODIFY COLUMN  `user_id` CHAR(22) NULL COMMENT '执行用户ID';
      ALTER TABLE us_issue MODIFY COLUMN  `create_time` CHAR(22) NULL COMMENT '创建时间';
      ALTER TABLE us_issue MODIFY COLUMN  `description` CHAR(22) NULL COMMENT '任务描述';
      ALTER TABLE us_issue MODIFY COLUMN  `task_status_code` CHAR(22) NULL COMMENT '任务状态ID';
      ALTER TABLE us_issue MODIFY COLUMN  `company_id` CHAR(22) NULL COMMENT '执行公司ID';
      ALTER TABLE us_issue MODIFY COLUMN  `order_id` CHAR(22) NULL COMMENT '订单ID';
      ALTER TABLE us_issue MODIFY COLUMN  `goods_id` CHAR(22) NULL COMMENT '产品ID';
      ALTER TABLE us_issue MODIFY COLUMN  `flow_node_id` CHAR(22) NULL COMMENT '流程节点ID';
      
alter TABLE us_issue_done COMMENT = '任务执行明细'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_issue_done MODIFY COLUMN  `issue_done_id` CHAR(22) NOT NULL COMMENT '任务执行明细ID';
      ALTER TABLE us_issue_done MODIFY COLUMN  `issue_id` CHAR(22) NULL COMMENT '工作任务ID';
      ALTER TABLE us_issue_done MODIFY COLUMN  `description` CHAR(22) NULL COMMENT '执行描述';
      ALTER TABLE us_issue_done MODIFY COLUMN  `create_time` CHAR(22) NULL COMMENT '创建时间';
      ALTER TABLE us_issue_done MODIFY COLUMN  `user_id` CHAR(22) NULL COMMENT '用户ID';
      ALTER TABLE us_issue_done MODIFY COLUMN  `done_time` CHAR(22) NULL COMMENT '执行时间';
      
alter TABLE us_issue_done_attach COMMENT = '任务执行明细-附件'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_issue_done_attach MODIFY COLUMN  `issue_done_id` CHAR(22) NOT NULL COMMENT '任务执行明细ID';
      ALTER TABLE us_issue_done_attach MODIFY COLUMN  `file_id` CHAR(22) NOT NULL COMMENT '文件ID';
      
alter TABLE us_member_level COMMENT = '会员等级'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_member_level MODIFY COLUMN  `member_level_id` CHAR(22) NOT NULL COMMENT '会员等级ID';
      ALTER TABLE us_member_level MODIFY COLUMN  `level_name` CHAR(22) NULL COMMENT '会员等级名称';
      ALTER TABLE us_member_level MODIFY COLUMN  `description` CHAR(22) NULL COMMENT '描述';
      ALTER TABLE us_member_level MODIFY COLUMN  `company_id` CHAR(22) NULL COMMENT '运营商ID';
      ALTER TABLE us_member_level MODIFY COLUMN  `sequence` CHAR(22) NULL COMMENT '等级序列';
      
alter TABLE us_menu COMMENT = '菜单'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_menu MODIFY COLUMN  `menu_id` CHAR(22) NOT NULL COMMENT '菜单ID';
      ALTER TABLE us_menu MODIFY COLUMN  `parent_menu_id` CHAR(22) NULL COMMENT '名称';
      ALTER TABLE us_menu MODIFY COLUMN  `url` CHAR(22) NULL COMMENT 'URL';
      ALTER TABLE us_menu MODIFY COLUMN  `banner_html` CHAR(22) NULL COMMENT 'Banner_Html';
      ALTER TABLE us_menu MODIFY COLUMN  `sequence` CHAR(22) NULL COMMENT '顺序';
      
alter TABLE us_menu_auth COMMENT = '菜单权限'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_menu_auth MODIFY COLUMN  `company_id` CHAR(22) NOT NULL COMMENT '公司ID';
      ALTER TABLE us_menu_auth MODIFY COLUMN  `menu_id` CHAR(22) NOT NULL COMMENT '菜单ID';
      
alter TABLE us_menu_goods COMMENT = '菜单-产品'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_menu_goods MODIFY COLUMN  `menu_id` CHAR(22) NOT NULL COMMENT '菜单ID';
      ALTER TABLE us_menu_goods MODIFY COLUMN  `goods_id` CHAR(22) NOT NULL COMMENT '产品ID';
      ALTER TABLE us_menu_goods MODIFY COLUMN  `sequence` CHAR(22) NULL COMMENT '顺序';
      
alter TABLE us_message COMMENT = '消息'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_message MODIFY COLUMN  `message_id` CHAR(22) NOT NULL COMMENT '消息ID';
      ALTER TABLE us_message MODIFY COLUMN  `user_id` CHAR(22) NULL COMMENT '接收用户ID';
      ALTER TABLE us_message MODIFY COLUMN  `content` CHAR(22) NULL COMMENT '内容';
      ALTER TABLE us_message MODIFY COLUMN  `create_time` CHAR(22) NULL COMMENT '创建时间';
      ALTER TABLE us_message MODIFY COLUMN  `dict_code` CHAR(22) NULL COMMENT '业务事件ID';
      
alter TABLE us_message_subscribe COMMENT = '消息订阅'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_message_subscribe MODIFY COLUMN  `company_id` CHAR(22) NOT NULL COMMENT '公司ID';
      ALTER TABLE us_message_subscribe MODIFY COLUMN  `dict_code` CHAR(22) NOT NULL COMMENT '业务事件ID';
      ALTER TABLE us_message_subscribe MODIFY COLUMN  `create_time` CHAR(22) NULL COMMENT '创建时间';
      
alter TABLE us_operator COMMENT = '运营商'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_operator MODIFY COLUMN  `company_id` CHAR(22) NOT NULL COMMENT '运营商ID';
      ALTER TABLE us_operator MODIFY COLUMN  `city_code` CHAR(22) NULL COMMENT '城市编码';
      ALTER TABLE us_operator MODIFY COLUMN  `platform_name` CHAR(22) NULL COMMENT '平台名称';
      ALTER TABLE us_operator MODIFY COLUMN  `file_id` CHAR(22) NULL COMMENT '平台Logo';
      ALTER TABLE us_operator MODIFY COLUMN  `is_main_operator` CHAR(22) NULL COMMENT 'is主运营商';
      ALTER TABLE us_operator MODIFY COLUMN  `create_time` CHAR(22) NULL COMMENT '创建时间';
      ALTER TABLE us_operator MODIFY COLUMN  `operator_code` CHAR(22) NULL COMMENT '运营商代码';
      
alter TABLE us_order COMMENT = '订单'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_order MODIFY COLUMN  `order_id` CHAR(22) NOT NULL COMMENT '订单ID';
      ALTER TABLE us_order MODIFY COLUMN  `contract_money` CHAR(22) NULL COMMENT '订单金额';
      ALTER TABLE us_order MODIFY COLUMN  `create_time` CHAR(22) NULL COMMENT '交易时间';
      ALTER TABLE us_order MODIFY COLUMN  `order_status_code` CHAR(22) NULL COMMENT '订单状态ID';
      ALTER TABLE us_order MODIFY COLUMN  `balance_money` CHAR(22) NULL COMMENT '结算金额';
      ALTER TABLE us_order MODIFY COLUMN  `company_id` CHAR(22) NULL COMMENT '运营商ID';
      ALTER TABLE us_order MODIFY COLUMN  `order_code` CHAR(22) NULL COMMENT '订单编号';
      ALTER TABLE us_order MODIFY COLUMN  `user_id` CHAR(22) NULL COMMENT '联系人ID';
      ALTER TABLE us_order MODIFY COLUMN  `advance_payment` CHAR(22) NULL COMMENT '定金合计';
      
alter TABLE us_order_goods COMMENT = '订单-产品'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_order_goods MODIFY COLUMN  `order_id` CHAR(22) NOT NULL COMMENT '订单ID';
      ALTER TABLE us_order_goods MODIFY COLUMN  `goods_id` CHAR(22) NOT NULL COMMENT '产品ID';
      ALTER TABLE us_order_goods MODIFY COLUMN  `price` CHAR(22) NULL COMMENT '交易单价';
      ALTER TABLE us_order_goods MODIFY COLUMN  `sub_money` CHAR(22) NULL COMMENT '金额小计';
      ALTER TABLE us_order_goods MODIFY COLUMN  `amount` CHAR(22) NULL COMMENT '数量';
      ALTER TABLE us_order_goods MODIFY COLUMN  `company_id` CHAR(22) NULL COMMENT '供应商ID';
      ALTER TABLE us_order_goods MODIFY COLUMN  `advance_payment` CHAR(22) NULL COMMENT '定金';
      
alter TABLE us_order_goods_attr COMMENT = '订单-产品属性'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_order_goods_attr MODIFY COLUMN  `order_id` CHAR(22) NOT NULL COMMENT '订单ID';
      ALTER TABLE us_order_goods_attr MODIFY COLUMN  `goods_id` CHAR(22) NOT NULL COMMENT '产品ID';
      ALTER TABLE us_order_goods_attr MODIFY COLUMN  `goods_attr_id` CHAR(22) NOT NULL COMMENT '产品属性ID';
      ALTER TABLE us_order_goods_attr MODIFY COLUMN  `attr_name` CHAR(22) NULL COMMENT '属性名';
      ALTER TABLE us_order_goods_attr MODIFY COLUMN  `attr_value` CHAR(22) NULL COMMENT '属性值';
      ALTER TABLE us_order_goods_attr MODIFY COLUMN  `unit` CHAR(22) NULL COMMENT '计量单位';
      ALTER TABLE us_order_goods_attr MODIFY COLUMN  `dict_code` CHAR(22) NULL COMMENT '属性类型ID';
      ALTER TABLE us_order_goods_attr MODIFY COLUMN  `sequence` CHAR(22) NULL COMMENT '属性顺序';
      
alter TABLE us_order_invoice COMMENT = '订单发票'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_order_invoice MODIFY COLUMN  `order_invoice_id` CHAR(22) NOT NULL COMMENT '订单发票ID';
      ALTER TABLE us_order_invoice MODIFY COLUMN  `invoice_id` CHAR(22) NULL COMMENT '常用发票信息ID';
      ALTER TABLE us_order_invoice MODIFY COLUMN  `order_id` CHAR(22) NULL COMMENT '订单ID';
      ALTER TABLE us_order_invoice MODIFY COLUMN  `company_id` CHAR(22) NULL COMMENT '开票单位ID';
      ALTER TABLE us_order_invoice MODIFY COLUMN  `user_id` CHAR(22) NULL COMMENT '用户ID';
      ALTER TABLE us_order_invoice MODIFY COLUMN  `create_time` CHAR(22) NULL COMMENT '创建时间';
      ALTER TABLE us_order_invoice MODIFY COLUMN  `invoice_code` CHAR(22) NULL COMMENT '发票号码';
      ALTER TABLE us_order_invoice MODIFY COLUMN  `dict_code` CHAR(22) NULL COMMENT '发票类型ID';
      ALTER TABLE us_order_invoice MODIFY COLUMN  `money` CHAR(22) NULL COMMENT '发票金额';
      
alter TABLE us_order_invoice_item COMMENT = '订单发票明细'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_order_invoice_item MODIFY COLUMN  `invoice_item_id` CHAR(22) NOT NULL COMMENT '订单发票明细ID';
      ALTER TABLE us_order_invoice_item MODIFY COLUMN  `goods_name` CHAR(22) NULL COMMENT '品名';
      ALTER TABLE us_order_invoice_item MODIFY COLUMN  `amount` CHAR(22) NULL COMMENT '数量';
      ALTER TABLE us_order_invoice_item MODIFY COLUMN  `non_tax_price` CHAR(22) NULL COMMENT '未税单价';
      ALTER TABLE us_order_invoice_item MODIFY COLUMN  `order_invoice_id` CHAR(22) NULL COMMENT '订单发票ID';
      
alter TABLE us_recommand COMMENT = '桌面优选'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_recommand MODIFY COLUMN  `company_id` CHAR(22) NOT NULL COMMENT '运营商ID';
      ALTER TABLE us_recommand MODIFY COLUMN  `goods_id` CHAR(22) NOT NULL COMMENT '产品ID';
      ALTER TABLE us_recommand MODIFY COLUMN  `recommand_sort` CHAR(22) NULL COMMENT '顺序';
      ALTER TABLE us_recommand MODIFY COLUMN  `enabled` CHAR(22) NULL COMMENT 'is有效';
      ALTER TABLE us_recommand MODIFY COLUMN  `user_id` CHAR(22) NULL COMMENT '用户ID';
      ALTER TABLE us_recommand MODIFY COLUMN  `update_time` CHAR(22) NULL COMMENT '更新时间';
      
alter TABLE us_sell_link COMMENT = '关联销售'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_sell_link MODIFY COLUMN  `goods_id` CHAR(22) NOT NULL COMMENT '关联产品ID';
      ALTER TABLE us_sell_link MODIFY COLUMN  `sell_link_code` CHAR(22) NULL COMMENT '关联销售类型ID';
      
alter TABLE us_shareholder COMMENT = '股东'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_shareholder MODIFY COLUMN  `shareholder_id` CHAR(22) NOT NULL COMMENT '股东ID';
      ALTER TABLE us_shareholder MODIFY COLUMN  `shareholder_name` CHAR(22) NULL COMMENT '股东名称';
      ALTER TABLE us_shareholder MODIFY COLUMN  `is_org` CHAR(22) NULL COMMENT 'is企业法人';
      ALTER TABLE us_shareholder MODIFY COLUMN  `percent` CHAR(22) NULL COMMENT '占股比例';
      ALTER TABLE us_shareholder MODIFY COLUMN  `money` CHAR(22) NULL COMMENT '出资金额';
      ALTER TABLE us_shareholder MODIFY COLUMN  `company_id` CHAR(22) NULL COMMENT '公司ID';
      ALTER TABLE us_shareholder MODIFY COLUMN  `update_time` CHAR(22) NULL COMMENT '变更时间';
      ALTER TABLE us_shareholder MODIFY COLUMN  `create_time` CHAR(22) NULL COMMENT '创建时间';
      
alter TABLE us_tag COMMENT = '产品标签'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_tag MODIFY COLUMN  `tag_id` CHAR(22) NOT NULL COMMENT '产品标签ID';
      ALTER TABLE us_tag MODIFY COLUMN  `tag_desc` CHAR(22) NULL COMMENT '标签名';
      ALTER TABLE us_tag MODIFY COLUMN  `company_id` CHAR(22) NULL COMMENT '运营商ID';
      ALTER TABLE us_tag MODIFY COLUMN  `user_id` CHAR(22) NULL COMMENT '用户ID';
      ALTER TABLE us_tag MODIFY COLUMN  `update_time` CHAR(22) NULL COMMENT '更新时间';
      
alter TABLE us_user COMMENT = '用户'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_user MODIFY COLUMN  `user_id` CHAR(22) NOT NULL COMMENT '用户ID';
      ALTER TABLE us_user MODIFY COLUMN  `mobile` CHAR(22) NULL COMMENT '手机号码';
      ALTER TABLE us_user MODIFY COLUMN  `name` CHAR(22) NULL COMMENT '姓名';
      ALTER TABLE us_user MODIFY COLUMN  `email` CHAR(22) NULL COMMENT '邮箱';
      ALTER TABLE us_user MODIFY COLUMN  `is_admin` CHAR(22) NULL COMMENT 'isAdmin';
      ALTER TABLE us_user MODIFY COLUMN  `password` CHAR(22) NULL COMMENT '密码';
      ALTER TABLE us_user MODIFY COLUMN  `create_time` CHAR(22) NULL COMMENT '创建时间';
      ALTER TABLE us_user MODIFY COLUMN  `disabled` CHAR(22) NULL COMMENT 'is禁用';
      ALTER TABLE us_user MODIFY COLUMN  `company_id` CHAR(22) NULL COMMENT '公司ID';
      ALTER TABLE us_user MODIFY COLUMN  `qq` CHAR(22) NULL COMMENT 'QQ';
      
alter TABLE us_widget COMMENT = 'widget'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_widget MODIFY COLUMN  `widget_id` CHAR(22) NOT NULL COMMENT 'widgetID';
      ALTER TABLE us_widget MODIFY COLUMN  `widget_name` CHAR(22) NULL COMMENT '名字';
      ALTER TABLE us_widget MODIFY COLUMN  `widget_description` CHAR(22) NULL COMMENT '描述';
      ALTER TABLE us_widget MODIFY COLUMN  `file_id` CHAR(22) NULL COMMENT '图片ID';
      ALTER TABLE us_widget MODIFY COLUMN  `dict_code` CHAR(22) NULL COMMENT 'Widget类型ID';
      
alter TABLE us_widget_user COMMENT = 'Widget_用户'  ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    ALTER TABLE us_widget_user MODIFY COLUMN  `user_id` CHAR(22) NOT NULL COMMENT '用户ID';
      ALTER TABLE us_widget_user MODIFY COLUMN  `widget_id` CHAR(22) NOT NULL COMMENT 'widgetID';
      ALTER TABLE us_widget_user MODIFY COLUMN  `cancle_time` CHAR(22) NULL COMMENT '关闭时间';