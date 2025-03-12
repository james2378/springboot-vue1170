package com.entity.view;

import com.entity.DiscusszhunongtuopinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 助农脱贫评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-02-08 17:32:26
 */
@TableName("discusszhunongtuopin")
public class DiscusszhunongtuopinView  extends DiscusszhunongtuopinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusszhunongtuopinView(){
	}
 
 	public DiscusszhunongtuopinView(DiscusszhunongtuopinEntity discusszhunongtuopinEntity){
 	try {
			BeanUtils.copyProperties(this, discusszhunongtuopinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
