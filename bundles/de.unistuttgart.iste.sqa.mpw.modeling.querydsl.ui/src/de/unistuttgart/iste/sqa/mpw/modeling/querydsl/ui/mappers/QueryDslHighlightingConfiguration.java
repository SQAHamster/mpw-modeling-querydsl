package de.unistuttgart.iste.sqa.mpw.modeling.querydsl.ui.mappers;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class QueryDslHighlightingConfiguration extends DefaultHighlightingConfiguration {
	public static final String DOCUMENTATION_COMMENT_ID = "documentation";

	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(DOCUMENTATION_COMMENT_ID, "Documentation comment",
				documentationCommentTextStyle());
	}

	public TextStyle documentationCommentTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(63, 95, 191)); // default Eclipse JavaDoc color
		return textStyle;
	}
}
