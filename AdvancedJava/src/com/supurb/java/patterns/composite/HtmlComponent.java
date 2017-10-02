/**
 * 
 */
package com.supurb.java.patterns.composite;

import java.util.List;

/**
 * The default/abstract component from which both Composite And Leaf can be implemented
 * 
 * @author Subhojit
 *
 */
abstract public interface HtmlComponent 
{
	public abstract String getTagName();
	public abstract void setStartTag(String tag);
	public abstract void setEndTag(String tag);
	public default void setTagBody(String tagBody){
		throw new UnsupportedOperationException("Current operation is not support for this object");
	}
	public default void addChildTag(HtmlComponent htmlTag){
		throw new UnsupportedOperationException("Current operation is not support for this object");
	}
	public default void removeChildTag(HtmlComponent htmlTag){
		throw new UnsupportedOperationException("Current operation is not support for this object");
	}
	public default List<HtmlComponent> getChildren(){
		throw new UnsupportedOperationException("Current operation is not support for this object");
	}
	public abstract void generateHtml();
	
}
