package kr.or.ddit.vo;

import java.util.List;

import lombok.Data;

@Data
public class DDITBoardVO {
	private int boNo;
	private String boTitle;
	private String boContent;
	private String boWriter;
	private String boDate;
	private int boHit;
	
	private String tag;
	
	private List<DDITTagVO> tagList;
}
