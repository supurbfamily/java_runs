package com.supurb.java.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class HTMLCompositeTag implements HtmlComponent {

	private String tagName;
	private String startTag;
	private String endTag;
	private List<HtmlComponent> childrenTag;
	
	public HTMLCompositeTag(String tagName) {
		this.tagName = tagName;
		this.startTag = "";
		this.endTag = "";
		this.childrenTag = new ArrayList<>();
	}

	@Override
	public String getTagName() {
		return tagName;
	}
	@Override
	public void setStartTag(String tag) {
		this.startTag = tag;
	}
	
	@Override
	public void setEndTag(String tag) {
		this.endTag = tag;
	}
	
	@Override
	public void addChildTag(HtmlComponent htmlTag){
		childrenTag.add(htmlTag);
	}
	@Override
	public void removeChildTag(HtmlComponent htmlTag){
		childrenTag.remove(htmlTag);
	}
	@Override
	public List<HtmlComponent>getChildren(){
		return childrenTag;
	}
	
	@Override
	public void generateHtml() {
		System.out.println(startTag);
		for(HtmlComponent tag : childrenTag){
			tag.generateHtml();
		}
		System.out.println(endTag);
	}

}
