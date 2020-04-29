package com.jmax4you.learn.cmd.controller;

import com.aliyuncs.alidns.model.v20150109.*;
import com.jmax4you.learn.cmd.service.OprateDomainService;
import com.jmax4you.learn.cmd.vo.DomainRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AliyunController {

	@Autowired
	private OprateDomainService oprateDomainService;

	@RequestMapping("/getDescribeDomainRecordsList")
	@ResponseBody
	public DescribeDomainRecordsResponse getDescribeDomainRecordsList(@RequestParam String domainName,
																	  @RequestParam(required = false,defaultValue = "1") String page,
																	  @RequestParam(required = false,defaultValue = "20") String pageSize) {
		DescribeDomainRecordsRequest request = new DescribeDomainRecordsRequest();
		request.setDomainName(domainName);
		return oprateDomainService.getDescribeDomainRecordsList(request);
	}

	@RequestMapping("/getDescribeDomainRecordInfo")
	@ResponseBody
	public DescribeDomainRecordInfoResponse getDescribeDomainRecordInfo(@RequestParam String recordId){
		DescribeDomainRecordInfoRequest request = new DescribeDomainRecordInfoRequest();
		request.setRecordId(recordId);
		return oprateDomainService.getDescribeDomainRecordInfo(request);
	}

	@RequestMapping("/addDomainRecord")
	@ResponseBody
	public AddDomainRecordResponse addDomainRecord(@RequestBody DomainRecord domainRecord){
		AddDomainRecordRequest request = new AddDomainRecordRequest();
		request.setDomainName(domainRecord.getDomainName());
		request.setLang(domainRecord.getLang());
		request.setLine(domainRecord.getLine());
		request.setPriority(domainRecord.getPriority());
		request.setRR(domainRecord.getrR());
		request.setTTL(domainRecord.gettTL());
		request.setType(domainRecord.getType());
		request.setValue(domainRecord.getValue());
		request.setUserClientIp(domainRecord.getUserClientIp());
		return oprateDomainService.addDomainRecord(request);
	}

	@RequestMapping("/deleteDomainRecord")
	@ResponseBody
	public DeleteDomainRecordResponse deleteDomainRecord(@RequestParam String recordId){
		DeleteDomainRecordRequest request = new DeleteDomainRecordRequest();
		request.setRecordId(recordId);
		return oprateDomainService.deleteDomainRecord(request);
	}

	@RequestMapping("/updateDomainRecord")
	@ResponseBody
	public UpdateDomainRecordResponse updateDomainRecord(@RequestBody DomainRecord domainRecord){
		UpdateDomainRecordRequest request = new UpdateDomainRecordRequest();
		request.setRecordId(domainRecord.getRecordId());
		request.setLang(domainRecord.getLang());
		request.setLine(domainRecord.getLine());
		request.setPriority(domainRecord.getPriority());
		request.setRR(domainRecord.getrR());
		request.setTTL(domainRecord.gettTL());
		request.setType(domainRecord.getType());
		request.setValue(domainRecord.getValue());
		request.setUserClientIp(domainRecord.getUserClientIp());
		return oprateDomainService.updateDomainRecord(request);
	}
	@RequestMapping("/setDomainRecordStatus")
	@ResponseBody
	public SetDomainRecordStatusResponse setDomainRecordStatus(@RequestParam String recordId,@RequestParam String status){
		SetDomainRecordStatusRequest request = new SetDomainRecordStatusRequest();
		request.setRecordId(recordId);
		request.setStatus(status);
		return oprateDomainService.setDomainRecordStatus(request);
	}

}
