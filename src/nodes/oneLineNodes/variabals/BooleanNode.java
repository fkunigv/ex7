package nodes.oneLineNodes.variabals;

import main.MasterTypeOneException;
import nodes.BadMemberNameDiscovered;
import nodes.NodeTypes;
import nodes.nodeFactories.DecelerationType;
import nodes.oneLineNodes.VariableNode;
import parser.LineSyntaxException;

/**
 * A class representing a Boolean variable node
 * @author owner
 */
public class BooleanNode extends VariableNode {

	private static final String BOOLEAN_REGEX = "(true|false)";
	private static final String BOOLEAN_VARIABLE = "(" +
	BOOLEAN + LEFT_VARIABLE_NODE_BASE_REGEX + BOOLEAN_REGEX + OR +
			VARIABLE_NAME_REGEX + OR +
			POSSIBLE_ASSIGNED_FOR_ALL_TYPES +
			OR + RETURNING_ARRAY + ")?)?" + POSSIBLE_SPACE + ";?";

	private final static String structurePattern = BOOLEAN_VARIABLE;
	private static final int VARIABLE_NAME = 3;
	private static final int COMPARED_VARIABLE_NAME = 6;

	/**
	 * constructor
	 * @param lineData - the Line Strin Data
	 * @param lineNum - the number of the line
	 * @throws LineSyntaxException
	 * @throws BadMemberNameDiscovered
	 */
	public BooleanNode(String lineData, int lineNum)
			throws MasterTypeOneException {
		super(lineData, lineNum, DecelerationType.BOOLEAN, structurePattern);
		this.setNodeType(NodeTypes.VARIABLE_INITIALIZATION_NODE);
		this.setNodeProperties(VARIABLE_NAME, COMPARED_VARIABLE_NAME);
	}

	/**
	 * @return the structurepattern
	 */
	public static String getStructurepattern() {
		return structurePattern;
	}

}
