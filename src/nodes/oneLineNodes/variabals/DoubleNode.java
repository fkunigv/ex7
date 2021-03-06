package nodes.oneLineNodes.variabals;

import main.MasterTypeOneException;
import nodes.BadMemberNameDiscovered;
import nodes.NodeTypes;
import nodes.nodeFactories.DecelerationType;
import nodes.oneLineNodes.VariableNode;
import parser.LineSyntaxException;

/**
 * A class representing a double variable node
 * @author owner
 */
public class DoubleNode extends VariableNode {

	public static final String DOUBLE_REGEX = "-?\\d+(\\.\\d+)?";
	private static final String DOUBLE_VARIABLE = "(" + DOUBLE + ")("
			+ POSSIBLE_SPACE + EMPTY_BRACKETS + ")?" + POSSIBLE_SPACE + "(" +
			VARIABLE_NAME_REGEX + ")" + POSSIBLE_SPACE + "("
			+ ASSIGNMENT_OPERATOR + POSSIBLE_SPACE + "(" + DOUBLE_REGEX + OR +
			VARIABLE_NAME_REGEX + OR + SJAVAC_MATH_OPERATION + OR +
			POSSIBLE_ASSIGNED_FOR_ALL_TYPES +
			OR + RETURNING_ARRAY + ")?)?" + POSSIBLE_SPACE + ";?";

	private final static String structurePattern = DOUBLE_VARIABLE;
	private static final int VARIABLE_NAME = 3;
	private static final int COMPARED_VARIABLE_NAME = 6;


	/**
	 * constructor
	 * @param lineData - the Line Strin Data
	 * @param lineNum - the number of the line
	 * @throws LineSyntaxException
	 * @throws BadMemberNameDiscovered
	 */

	public DoubleNode(String lineData, int lineNum)
			throws MasterTypeOneException {
		super(lineData, lineNum, DecelerationType.DOUBLE, structurePattern);
		this.setNodeType(NodeTypes.VARIABLE_INITIALIZATION_NODE);
		this.setNodeProperties(VARIABLE_NAME, COMPARED_VARIABLE_NAME);
	}


	/**
	 * @return the structurepattern
	 */
	public static String getStructurePattern() {
		return structurePattern;
	}

}
