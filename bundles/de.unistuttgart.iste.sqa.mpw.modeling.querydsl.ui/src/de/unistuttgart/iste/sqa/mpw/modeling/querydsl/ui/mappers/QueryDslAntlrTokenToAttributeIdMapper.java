package de.unistuttgart.iste.sqa.mpw.modeling.querydsl.ui.mappers;

import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;

public class QueryDslAntlrTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {
	
	@Override
	protected String calculateId(String tokenName, int tokenType) {
		if ("RULE_DOCUMENTATION".equals(tokenName)) {
			return QueryDslHighlightingConfiguration.DOCUMENTATION_COMMENT_ID;
		}
		return super.calculateId(tokenName, tokenType);
	}

}