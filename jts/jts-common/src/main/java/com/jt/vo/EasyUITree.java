package com.jt.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain=true)
@NoArgsConstructor
@AllArgsConstructor
public class EasyUITree {

	private Long id;      //节点id值
	private String text;  //节点名称
	private String state; // 状态：closed/open
}
