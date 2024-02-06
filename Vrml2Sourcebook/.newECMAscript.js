// ecmascript:  // uncomment this line if this code appears in CDATA section embedded inside an X3D Script node

// Author TODO  * authors please update metadata and information entries in this file *

// Description: Editable example ECMAscript (javascript) source file for use with X3D Script node
// Filename:    newECMAscript.js
// Author:      Don Brutzman
// Identifier:  http://www.web3d.org/x3d/content/examples/newECMAscript.js
// Created:     11 December 2007
// Revised:     26 October  2009
// Reference:   http://www.web3d.org/x3d/content/X3dTooltips.html#Script
// Reference:   http://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Scripts
// Reference:   http://www.web3d.org/x3d/specifications/ISO-IEC-FDIS-19775-1.2-X3D-AbstractSpecification/Part01/components/scripting.html
// Reference:   http://www.web3d.org/x3d/specifications/ISO-IEC-19777-1-X3DLanguageBindings-ECMAScript/Part1/X3D_ECMAScript.html
// License:     ../../license.html

function initialize () // no parameters allowed
{
    // The initialize() function is automatically invoked when the Script node is first activated, prior to other events

    var scriptName = 'newECMAscript.js'; // Author TODO:  authors need to edit this scriptName or else remove all uses

    Browser.print ('[' + scriptName + '] ' + 'initialize() commmenced...' + '\n');

    // TODO:  authors can insert initialization code here (if any is needed)

    Browser.print ('[' + scriptName + '] ' + 'initialize() complete' + '\n');
    // initialize() can also be invoked by other functions, if appropriate
}

// Note that inputOnly fields can only appear as names of handling functions (like the following).
// Not providing a named method for each inputOnly field means that Script ignores those events at run time.
   
function someInputOnlyFieldName (eventValue, timestamp) // eventValue is routed into Script, timestamp parameter optional
{
    // Author TODO:  authors can insert script code here; variable names must match Script field definitions
    //               outputOnly      fields can only be on left-hand side  (LHS) of assignment statements
    //               initializeOnly  fields can only be on right-hand side (RHS) of assignment statements
    //               inputOutput     fields can either be on LHS or RHS of assignment statements

    someOutputOnlyFieldName = someExpression (eventValue);  // Author TODO:  replace this assignment statement
}

// predefined optional methods that may be overridden for advanced functionality

function prepareEvents ()
{
    // optional method
    // invoked before any ROUTE processing occurs during the current frame's event cascade
    // example uses:  checking network buffers, checking asynchronous external processes
}
function eventsProcessed ()
{
    // optional method
    // invoked after the Script node handles all of its input events
    // use this method if multiple inputs are needed before generating a response
}
function shutdown ()
{
    // optional method
    // invoked when the X3D scene is being closed, or when Script node is being unloaded/replaced
    // allows graceful shutdown by releasing resources, closing network connections, providing final outputs, etc.
}