package com.njjhkj.qxm.service.impl;

import java.util.List;

import com.njjhkj.qxm.dao.DSDao;
import com.njjhkj.qxm.dao.FwxmDao;
import com.njjhkj.qxm.entity.DS;
import com.njjhkj.qxm.entity.Fwxm;
import com.njjhkj.qxm.service.DaShiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
public class DaShiServiceImpl<StudentDao> implements DaShiService {

	@Autowired
	@Qualifier("fwxmDao")
	private FwxmDao fwxmDao;

	@Autowired
	@Qualifier("dsDao")
	private DSDao dSDao;

	/**
	 * @description: 获取所有的服务项目
	 * @return: List<Fwxm>
	 * @author: ST
	 * @date: 2019/10/25
	 */
  	@Override
	public List<Fwxm> getFwxmAll(){

  		return fwxmDao.selectFwxmAll();
	}



	/**
	 * @description: 根据服务项目获取到指定的大师列表
	[idFwxm]服务项目ID
	 * @return: java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
	 * @author: King
	 * @date: 2019/10/25
	 */
	@Override
	public DS getDSByDsId(String dsId) {
		return dSDao.selectDSByDsId();
	}
//				qxmJdbcTemplate.queryForList( " " +
//						"select a.ds_id,a.prize,b.openid,b.name,b.comment,b.ds_sc,b.img_tx,b.tj,b.number_dd from " +
//						"ds_fwxm_gr a LEFT JOIN ds b on a.ds_id=b.ds_id" +
//						" where a.id_fwxm=? and b.state=1  ",new Object[]{idFwxm} );

	/** 
	 * @description: 插入预支付大师订单（status：0，表示还未支付；status:1,表示已经支付）
	[dsId, nameFwxm, prize, payId, userId]
	 * @return: int 
	 * @author: King
	 * @date: 2019/10/25 
	 */ 
//	public int insertIntoDsOrder(String dsId,String nameFwxm,int prize,String payId,String userId){
//		return qxmJdbcTemplate.update(" insert into ds_order values(null,?,?,now(),?,null,null,？,？,0) ",new Object[]{dsId,nameFwxm,prize,payId,userId});
//	}
	
	/** 
	 * @description: 根据用户的userId获取用户的所有咨询订单
	[userId]
	 * @return: java.util.List<java.util.Map<java.lang.String,java.lang.Object>> 
	 * @author: King
	 * @date: 2019/10/25 
	 */ 
//	public List<Map<String,Object>> getDsOrderByUserId(String userId){
//
//		return qxmJdbcTemplate.queryForList( " select a.ds_id,a.fwxm,a.prize,a.pay_time,a.pay_id,b.name,b.comment,b.ds_sc,b.img_tx from ds_order a left join ds b on a.ds_id=b.ds_id where a.user_id = ？and a.status=1 order by pay_time DESC ",new Object[]{userId} );
//	}




}
