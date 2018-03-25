package org.omg.java.cwm.analysis.datamining.miningcore.miningtask;

import org.omg.java.cwm.analysis.datamining.miningcore.miningfunctionsettings.*;
import org.omg.java.cwm.analysis.datamining.miningcore.miningmodel.*;
import org.omg.java.cwm.analysis.datamining.miningcore.miningdata.*;

/**
 * CWM Class
 *
 * This describes a task that builds a mining model, sometimes also called
 * training task.
 *
 * @author Ivan Holod
 *
 */
public class MiningBuildTask extends MiningTask {

	/**
	 * This specifies the logical data specification and specific parameters for
	 * the mining task.
	 */
	protected MiningFunctionSettings miningSettings;

	/**
	 * This is a description (metadata) of the mining model generated by the
	 * task.
	 */
	protected MiningModel resultModel;

	/**
	 * This maps the source attributes to the mining attributes contained in the
	 * settings.
	 */
	protected AttributeAssignmentSet settingsAssignment;

	/**
	 * This maps the source attributes of the validation data to the mining
	 * attributes contained in the settings.
	 */
	protected AttributeAssignmentSet settingsValidationAssignment;

	/**
	 * This specifies an optional data set to be used for validation when the
	 * model is built.
	 */
	protected PhysicalData validationData;

}