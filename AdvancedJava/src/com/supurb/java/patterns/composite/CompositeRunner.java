package com.supurb.java.patterns.composite;

public class CompositeRunner {

		public static void main(String[] args) {
		
		// base TAG HTML - Type composite
		HtmlComponent parentTag = new HTMLCompositeTag("<html>");
		parentTag.setStartTag("<html>");
		parentTag.setEndTag("</html>");
		
		// Child tag - Type composite
		HtmlComponent p1 = new HTMLCompositeTag("<body>");
		p1.setStartTag("<body>");
		p1.setEndTag("</body>");
		parentTag.addChildTag(p1);
		
		// Child tag - Type Leaf of BODY
		HtmlComponent child1 = new HtmlLeafTag("<P>");
		child1.setStartTag("<P>");
		child1.setEndTag("</P>");
		child1.setTagBody("Testing html tag library");
		p1.addChildTag(child1);
		
		// Child tag - Type Leaf of BODY
		child1 = new HtmlLeafTag("<P>");
		child1.setStartTag("<P>");
		child1.setEndTag("</P>");
		child1.setTagBody("Paragraph 2");
		p1.addChildTag(child1);
		
		
		parentTag.generateHtml();

	}

}
