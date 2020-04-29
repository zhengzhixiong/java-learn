package com.jmax4you.learn.cmd.service;

import com.aliyuncs.alidns.model.v20150109.*;

public interface OprateDomainService {


    /**
     * 获取解析记录列表
     * 请求参数
     *
     * 名称	类型	是否必选	示例值	描述
     * Action	String	是	DescribeDomainRecords
     * 系统规定参数。取值：DescribeDomainRecords。
     * DomainName	String	是	example.com
     * 域名名称。
     * Lang	String	否	en
     * 语言。
     * PageNumber	Long	否	1
     * 当前页数，起始值为1，默认为1。
     * PageSize	Long	否	20
     * 分页查询时设置的每页行数，最大值500，默认为20。
     * KeyWord	String	否	test
     * 关键字。
     * RRKeyWord	String	否	www
     * 主机记录的关键字，按照“%RRKeyWord%”模式搜索，不区分大小写。
     * TypeKeyWord	String	否	MX
     * 解析类型的关键字，按照全匹配搜索，不区分大小写。
     * ValueKeyWord	String	否	com
     * 记录值的关键字，按照“%ValueKeyWord%”模式搜索，不区分大小写。
     * OrderBy	String	否	default
     * 排序方式。按照解析添加的时间从新到旧排序。
     * Direction	String	否	DESC
     * 排序方向。取值范围：DESC、ASC。默认为：DESC。
     * SearchMode	String	否	LIKE
     * 搜索模式，取值：LIKE/EXACT/ADVANCED，其中LIKE（模糊）/EXACT（精确）搜索支持KeyWord字段，ADVANCED（高级）模式支持其他字段。
     * GroupId	Long	否	2223
     * 域名分组ID。
     * Type	String	否	A
     * 解析记录类型，参见解析记录类型格式。
     * Line	String	否	default
     * 解析线路，默认为default。
     * 参见解析线路枚举。
     * Status	String	否	Enable
     * 解析记录状态，取值：Enable/Disable。
     * @param request
     * @return
     * 返回数据
     *
     * 名称	类型	示例值	描述
     * RequestId	String	536E9CAD-DB30-4647-AC87-AA5CC38C5382
     * 请求ID。
     * TotalCount	Long	2
     * 解析记录总数。
     * PageNumber	Long	1
     * 当前页码。
     * PageSize	Long	2
     * 本次查询获取的解析数量。
     * DomainRecords	Array
         * DomainRecords	Array
         * 解析记录列表。
         * DomainName	String	example.com
         * 域名名称。
         * RecordId	String	9999985
         * 解析记录ID。
         * RR	String	www
         * 主机记录。
         * Type	String	MX
         * 记录类型。
         * Value	String	mail1.hichina.com
         * 记录值。
         * TTL	Long	600
         * 生存时间。
         * Priority	Long	5
         * MX记录的优先级。
         * Line	String	default
         * 解析线路。
         * Status	String	Enable
         * 当前的解析记录状态。
         * Locked	Boolean	false
         * 当前解析记录锁定状态。
         * Weight	Integer	2
         * 负载均衡权重。
         * Remark	String	备注
         * 备注。
     * 解析记录列表。
     */
    DescribeDomainRecordsResponse getDescribeDomainRecordsList(DescribeDomainRecordsRequest request);

    /**
     * 获取解析记录信息
     * 请求参数
     *
     * 名称	类型	是否必选	示例值	描述
     * Action	String	是	DescribeDomainRecordInfo
     * 系统规定参数。取值：DescribeDomainRecordInfo。
     * RecordId	String	是	9999985
     * 解析记录的ID 。
     * 此参数在添加解析时会返回，在获取域名解析列表时会返回。
     * AccessKeyId	String	否	your_accesskey_id
     * 您的AccessKey ID。
     * Lang	String	否	en
     * 用户语言。
     * UserClientIp	String	否	1.1.1.1
     * 用户端IP。
     * @param request
     * @return
     * 返回数据
     *
     * 名称	类型	示例值	描述
     * DomainId	String	00efd71a-770e-4255-b54e-6fe5659baffe
     * 域名ID。
     * DomainName	String	中文.com
     * 域名名称。
     * GroupId	String	2223
     * 域名分组ID。
     * GroupName	String	MyGroup
     * 域名分组名称。
     * Line	String	default
     * 解析线路。
     * Locked	Boolean	true
     * 解析记录锁定状态，取值：true/false。
     * Priority	Long	5
     * MX记录的优先级。
     * PunyCode	String	xn--fsq270a.com
     * 只针对中文域名返回punycode码。
     * RR	String	@
     * 解析类型。
     * RecordId	String	9999985
     * 解析记录的ID。
     * RequestId	String	536E9CAD-DB30-4647-AC87-AA5CC38C5382
     * 请求ID。
     * Status	String	Enable
     * 解析记录状态，取值：Enable/Disable。
     * TTL	Long	600
     * 生存时间。
     * Type	String	MX
     * 记录类型。
     * Value	String	mail.hichina.com
     * 记录值。
     */
    DescribeDomainRecordInfoResponse getDescribeDomainRecordInfo(DescribeDomainRecordInfoRequest request);

    /**
     * 添加解析记录
     *
     *
     * 请求参数
     *
     * 名称	类型	是否必选	示例值	描述
     * Action	String	是	AddDomainRecord
     * 系统规定参数。取值：AddDomainRecord。
     * DomainName	String	是	example.com
     * 域名名称。
     * RR	String	是	www
     * 主机记录。
     * 如果要解析@.exmaple.com，主机记录要填写”@”，而不是空。
     * Type	String	是	A
     * 解析记录类型，参见解析记录类型格式。
     * Value	String	是	202.106.0.20
     * 记录值。
     * AccessKeyId	String	否	your_accesskey_id
     * 您的AccessKey ID。
     * Lang	String	否	en
     * 语言。
     * Line	String	否	default
     * 解析线路，默认为default。
     * 参见解析线路枚举。
     * Priority	Long	否	1
     * MX记录的优先级，取值范围：[1,50]。
     * 记录类型为MX记录时，此参数必需，MX 优先级的数值越低，优先级别就越高。
     * TTL	Long	否	600
     * 解析生效时间，默认为600秒（10分钟）。
     * 参见TTL定义说明。
     * UserClientIp	String	否	1.1.1.1
     * 用户端IP。
     * 返回数据
     *
     * 名称	类型	示例值	描述
     * RecordId	String	9999985
     * 解析记录的ID。
     * RequestId	String	536E9CAD-DB30-4647-AC87-AA5CC38C5382
     * 请求ID。
     * @param request
     * @return
     */
    AddDomainRecordResponse addDomainRecord(AddDomainRecordRequest request);

    /**
     * 删除解析记录
     * 请求参数
     *
     * 名称	类型	是否必选	示例值	描述
     * Action	String	是	DeleteDomainRecord
     * 系统规定参数。取值：DeleteDomainRecord。
     * RecordId	String	是	9999985
     * 解析记录的ID。
     * 此参数在添加解析时会返回，在获取域名解析列表时会返回。
     * AccessKeyId	String	否	your_accesskey_id
     * 您的AccessKey ID。
     * Lang	String	否	en
     * 语言。
     * UserClientIp	String	否	1.1.1.1
     * 用户端IP。
     * 返回数据
     *
     * 名称	类型	示例值	描述
     * RecordId	String	9999985
     * 解析记录的ID。
     * RequestId	String	536E9CAD-DB30-4647-AC87-AA5CC38C5382
     * 请求ID。
     * @param request
     * @return
     */
    DeleteDomainRecordResponse deleteDomainRecord(DeleteDomainRecordRequest request);

    /**
     * 修改解析记录
     *
     * 请求参数
     *
     * 名称	类型	是否必选	示例值	描述
     * Action	String	是	UpdateDomainRecord
     * 系统规定参数。取值：UpdateDomainRecord。
     * RR	String	是	www
     * 主机记录。
     * 如果要解析@.exmaple.com，主机记录要填写”@”，而不是空。
     * RecordId	String	是	9999985
     * 解析记录的ID。
     * Type	String	是	A
     * 解析记录类型，参见解析记录类型格式。
     * Value	String	是	202.106.0.20
     * 记录值。
     * AccessKeyId	String	否	your_accesskey_id
     * 您的AccessKey ID。
     * Lang	String	否	en
     * 语言。
     * Line	String	否	default
     * 解析线路，默认为default。
     * 参见解析线路枚举。
     * Priority	Long	否	1
     * MX记录的优先级，取值范围：[1,10]。
     * 记录类型为MX记录时，此参数必需。
     * TTL	Long	否	600
     * 解析生效时间，默认为600秒（10分钟）。
     * 参见TTL定义说明。
     * UserClientIp	String	否	1.1.1.1
     * 用户端IP。
     * 返回数据
     *
     * 名称	类型	示例值	描述
     * RecordId	String	9999985
     * 解析记录的ID。
     * RequestId	String	536E9CAD-DB30-4647-AC87-AA5CC38C5382
     * 请求ID。
     * @param request
     * @return
     */
    UpdateDomainRecordResponse updateDomainRecord(UpdateDomainRecordRequest request);

    /**
     * 设置解析记录状态
     * 请求参数
     *
     * 名称	类型	是否必选	示例值	描述
     * Action	String	是	SetDomainRecordStatus
     * 系统规定参数。取值：SetDomainRecordStatus。
     * RecordId	String	是	9999985
     * 解析记录的ID。
     * Status	String	是	Disable
     * 解析记录状态。取值：
     * Enable: 启用解析
     * Disable: 暂停解析
     * AccessKeyId	String	否	your_accesskey_id
     * 您的AccessKey ID。
     * Lang	String	否	en
     * 语言。
     * UserClientIp	String	否	1.1.1.1
     * 用户端IP。
     * 返回数据
     *
     * 名称	类型	示例值	描述
     * RecordId	String	9999985
     * 解析记录的ID。
     * RequestId	String	536E9CAD-DB30-4647-AC87-AA5CC38C5382
     * 请求ID。
     * Status	String	Disable
     * 当前解析记录状态。
     * @param request
     * @return
     */
    SetDomainRecordStatusResponse setDomainRecordStatus(SetDomainRecordStatusRequest request);
}
