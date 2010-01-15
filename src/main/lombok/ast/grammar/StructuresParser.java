package lombok.ast.grammar;

import lombok.ast.Node;

import org.parboiled.BaseParser;
import org.parboiled.Parboiled;
import org.parboiled.Rule;

public class StructuresParser extends BaseParser<Node, StructuresActions> {
	private final ParserGroup group;
	
	public StructuresParser(ParserGroup group) {
		super(Parboiled.createActions(StructuresActions.class));
		this.group = group;
	}
	
	public Rule classBody() {
		return enforcedSequence(
				ch('{'), group.basics.optWS(), ch('}'), group.basics.optWS());
	}
	
	public Rule methodArguments() {
		return enforcedSequence(
				ch('('),
				group.basics.optWS(),
				optional(sequence(
						group.operators.anyExpression(),
						SET(),
						zeroOrMore(sequence(
								ch(','),
								group.basics.optWS(),
								group.operators.anyExpression(), SET())))),
				ch(')'),
				group.basics.optWS(),
				SET(actions.createMethodArguments(VALUE("optional/sequence"), VALUES("optional/sequence/zeroOrMore/sequence"))));
	}
}