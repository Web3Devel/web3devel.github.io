package Vrml2Sourcebook.Chapter15Extrusion;

/*
Copyright (c) 1995-2023 held by the author(s).  All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions
are met:

    * Redistributions of source code must retain the above copyright
      notice, this list of conditions and the following disclaimer.
    * Redistributions in binary form must reproduce the above copyright
      notice, this list of conditions and the following disclaimer
      in the documentation and/or other materials provided with the
      distribution.
    * Neither the name of the Web3D Consortium (https://www.web3d.org)
      nor the names of its contributors may be used to endorse or
      promote products derived from this software without specific
      prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
POSSIBILITY OF SUCH DAMAGE.
*/

import org.web3d.x3d.jsail.Core.*;
import org.web3d.x3d.jsail.fields.*;
import org.web3d.x3d.jsail.Geometry3D.*;
import org.web3d.x3d.jsail.Grouping.*;
import org.web3d.x3d.jsail.Interpolation.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.Networking.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Time.*;

// Javadoc metadata annotations follow, see below for X3DJSAIL Java source code.
/**
 * <p> A wiggling snake whose spine is animated using a CoordinateInterpolator node. </p>
 <p> Related links: <a href="../../../Chapter15Extrusion/Figure15_17WigglingSnakeWithAxes.java">Figure15_17WigglingSnakeWithAxes.java</a> source, <a href="../../../Chapter15Extrusion/Figure15_17WigglingSnakeWithAxesIndex.html" target="_top">Figure15_17WigglingSnakeWithAxes catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter15Extrusion/Figure15_17WigglingSnakeWithAxes.x3d">Figure15_17WigglingSnakeWithAxes.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Figure 15.17, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://www.wiley.com/legacy/compbooks/vrml2sbk/ch15/15fig17.htm" target="_blank">http://www.wiley.com/legacy/compbooks/vrml2sbk/ch15/15fig17.htm</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> translator </i> </td>
			<td> Don Brutzman </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 20 August 2000 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> A wiggling snake whose spine is animated using a CoordinateInterpolator node. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter15Extrusion/Figure15_17WigglingSnakeWithAxes.x3d" target="_blank">https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter15Extrusion/Figure15_17WigglingSnakeWithAxes.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> X3D-Edit 3.3, <a href="https://savage.nps.edu/X3D-Edit" target="_blank">https://savage.nps.edu/X3D-Edit</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> license </i> </td>
			<td> <a href="../../../Chapter15Extrusion/../../license.html">../../license.html</a> </td>
		</tr>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center;" colspan="2">  &nbsp; </td>
		</tr>
	</table>

	<p>
		This program uses the
		<a href="https://www.web3d.org/specifications/java/X3DJSAIL.html" target="_blank">X3D Java Scene Access Interface Library (X3DJSAIL)</a>.
		It has been produced using the 
		<a href="https://www.web3d.org/x3d/stylesheets/X3dToJava.xslt" target="_blank">X3dToJava.xslt</a>
		stylesheet
	       (<a href="https://sourceforge.net/p/x3d/code/HEAD/tree/www.web3d.org/x3d/stylesheets/X3dToJava.xslt" target="_blank">version&amp;nbsp;control</a>)
                is used to create Java source code from an original <code>.x3d</code> model.
	</p>

	* @author Figure 15.17, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland
 */

public class Figure15_17WigglingSnakeWithAxes
{
	/** Default constructor to create this object. */
	public Figure15_17WigglingSnakeWithAxes ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
            try { // catch-all
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_0)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("Figure15_17WigglingSnakeWithAxes.x3d"))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Figure 15.17, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.wiley.com/legacy/compbooks/vrml2sbk/ch15/15fig17.htm"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATOR ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("20 August 2000"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("A wiggling snake whose spine is animated using a CoordinateInterpolator node."))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter15Extrusion/Figure15_17WigglingSnakeWithAxes.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../../license.html")))
  .setScene(new Scene()
    .addComments(" Computational cost of Extrusion compared to IndexedFaceSet: quicker to download, takes time to calculate polygonal faces and normals during initial loading, equally fast at run time. ")
    .addComments(" Authoring capabilities of Extrusion compared to IndexedFaceSet: can be more complicated to express, but also can provide great detail with much less effort. ")
    .addComments(" Animation considerations: computational cost of modifying spine and recalcuting all polygons/shading during each screen redraw is extremely high, though authorability remains very simple. ")
    .addComments(" First position and rotate viewpoint into positive-X-Y-Z octant, looking at object center ")
    .addChild(new WorldInfo().setTitle("Figure15_17WigglingSnakeWithAxes.x3d"))
    .addChild(new Viewpoint().setDescription("Wiggling snake, seen from behind, using Extrusion and OrientationInterpolator").setOrientation(-0.37796,0.91249,0.15656,0.85225).setPosition(10.0,5.0,10.0))
    .addChild(new Viewpoint().setDescription("Snake head").setOrientation(0.18581,0.96486,0.18581,-1.606566).setPosition(-10.0,4.0,0.0))
    .addComments(" Floor plane ")
    .addChild(new Shape()
      .setAppearance(new Appearance()
        .setMaterial(new Material().setDiffuseColor(0.6,0.6,0.0)))
      .setGeometry(new Box().setSize(20.0,0.01,20.0)))
    .addComments(" Snake ")
    .addChild(new Transform().setTranslation(0.0,0.3,0.0)
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material().setDiffuseColor(0.0,1.0,0.2)))
        .setGeometry(new Extrusion("SNAKE").setCreaseAngle(1.57).setCrossSection(new MFVec2f(new double[] {1.00,0.00,0.92,-0.38,0.71,-0.71,0.38,-0.92,0.00,-1.00,-0.38,-0.92,-0.71,-0.71,-0.92,-0.38,-1.00,-0.0,-0.92,0.38,-0.71,0.71,-0.38,0.92,0.00,1.00,0.38,0.92,0.71,0.71,0.92,0.38,1.00,0.00})).setScale(new MFVec2f(new double[] {0.050,0.020,0.200,0.100,0.400,0.150,0.250,0.250,0.270,0.270,0.300,0.300,0.300,0.300,0.300,0.300,0.300,0.300,0.300,0.300,0.290,0.290,0.290,0.290,0.290,0.290,0.280,0.280,0.280,0.280,0.250,0.250,0.200,0.200,0.100,0.100,0.050,0.050})).setSpine(new MFVec3f(new double[] {-4.100,0.0,0.000,-4.0,0.0,0.000,-3.529,0.0,0.674,-3.059,0.0,0.996,-2.588,0.0,0.798,-2.118,0.0,0.184,-1.647,0.0,-0.526,-1.176,0.0,-0.962,-0.706,0.0,-0.895,-0.235,0.0,-0.361,0.235,0.0,0.361,0.706,0.0,0.895,1.176,0.0,0.962,1.647,0.0,0.526,2.118,0.0,-0.184,2.588,0.0,-0.798,3.059,0.0,-0.996,3.529,0.0,-0.674,4.0,0.0,0.0})))))
    .addComments(" Adding this Inline reference to another scene superimposes X3D/VRML coordinate system axes. ")
    .addChild(new Transform().setScale(5.0,5.0,5.0)
      .addChild(new Inline("CoordinateAxes").setUrl(new String[] {"../../X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.x3d","https://www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.x3d","https://savage.nps.edu/Savage/Tools/Authoring/CoordinateAxes.x3d","../../X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.wrl","https://www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.wrl","https://savage.nps.edu/Savage/Tools/Authoring/CoordinateAxes.wrl"})))
    .addComments(" Animation clock ")
    .addChild(new TimeSensor("CLOCK").setCycleInterval(4).setLoop(true))
    .addComments(" each keyValue block corresponds to spine position at time 0.0, 0.25, 0.5, 0.75 and 1.0 (matching endpoints are closed so that looping is continuous) ")
    .addComments(" Animate the snake spine ")
    .addChild(new CoordinateInterpolator("SNAKE_WIGGLE").setKey(new double[] {0.0,0.25,0.50,0.75,1.0}).setKeyValue(getSNAKE_WIGGLE_3_27_keyValue()))
    .addChild(new ROUTE().setFromNode("CLOCK").setFromField("fraction_changed").setToNode("SNAKE_WIGGLE").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("SNAKE_WIGGLE").setFromField("value_changed").setToNode("SNAKE").setToField("set_spine")));
            }
            catch (Exception ex)
            {       
                System.err.println ("*** Further hints on X3DJSAIL errors and exceptions at");
                System.err.println ("*** https://www.web3d.org/specifications/java/X3DJSAIL.html");
                throw (ex);
            }
	}
	// end of initialize() method

		/** Large attribute array: CoordinateInterpolator DEF='SNAKE_WIGGLE' keyValue field, scene-graph level=3, element #27, 285 total numbers made up of 95 3-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFVec3f getSNAKE_WIGGLE_3_27_keyValue()
		{
			MFVec3f SNAKE_WIGGLE_3_27_keyValue = new MFVec3f(new double[] {-4.100,0.0,0.000,-4.0,0.0,0.000,-3.529,0.0,0.674,-3.059,0.0,0.996,-2.588,0.0,0.798,-2.118,0.0,0.184,-1.647,0.0,-0.526,-1.176,0.0,-0.962,-0.706,0.0,-0.895,-0.235,0.0,-0.361,0.235,0.0,0.361,0.706,0.0,0.895,1.176,0.0,0.962,1.647,0.0,0.526,2.118,0.0,-0.184,2.588,0.0,-0.798,3.059,0.0,-0.996,3.529,0.0,-0.674,4.0,0.0,0.000,-4.100,0.0,-1.000,-4.0,0.0,-1.000,-3.529,0.0,-0.739,-3.059,0.0,-0.092,-2.588,0.0,0.603,-2.118,0.0,0.983,-1.647,0.0,0.850,-1.176,0.0,0.274,-0.706,0.0,-0.446,-0.235,0.0,-0.932,0.235,0.0,-0.932,0.706,0.0,-0.446,1.176,0.0,0.274,1.647,0.0,0.850,2.118,0.0,0.983,2.588,0.0,0.603,3.059,0.0,-0.092,3.529,0.0,-0.739,4.0,0.0,-1.000,-4.100,0.0,0.000,-4.0,0.0,0.000,-3.529,0.0,-0.674,-3.059,0.0,-0.996,-2.588,0.0,-0.798,-2.118,0.0,-0.184,-1.647,0.0,0.526,-1.176,0.0,0.962,-0.706,0.0,0.895,-0.235,0.0,0.361,0.235,0.0,-0.361,0.706,0.0,-0.895,1.176,0.0,-0.962,1.647,0.0,-0.526,2.118,0.0,0.184,2.588,0.0,0.798,3.059,0.0,0.996,3.529,0.0,0.674,4.0,0.0,0.000,-4.100,0.0,1.000,-4.0,0.0,1.000,-3.529,0.0,0.739,-3.059,0.0,0.092,-2.588,0.0,-0.603,-2.118,0.0,-0.983,-1.647,0.0,-0.850,-1.176,0.0,-0.274,-0.706,0.0,0.446,-0.235,0.0,0.932,0.235,0.0,0.932,0.706,0.0,0.446,1.176,0.0,-0.274,1.647,0.0,-0.850,2.118,0.0,-0.983,2.588,0.0,-0.603,3.059,0.0,0.092,3.529,0.0,0.739,4.0,0.0,1.000,-4.100,0.0,0.000,-4.0,0.0,0.000,-3.529,0.0,0.674,-3.059,0.0,0.996,-2.588,0.0,0.798,-2.118,0.0,0.184,-1.647,0.0,-0.526,-1.176,0.0,-0.962,-0.706,0.0,-0.895,-0.235,0.0,-0.361,0.235,0.0,0.361,0.706,0.0,0.895,1.176,0.0,0.962,1.647,0.0,0.526,2.118,0.0,-0.184,2.588,0.0,-0.798,3.059,0.0,-0.996,3.529,0.0,-0.674,4.0,0.0,0.0});
			return SNAKE_WIGGLE_3_27_keyValue;
		}

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return Figure15_17WigglingSnakeWithAxes model
	 */
	public X3D getX3dModel()
	{	  
		return x3dModel;
	}
	   
    /** 
     * Default main() method provided for test purposes, uses CommandLine to set global ConfigurationProperties for this object.
     * @param args array of input parameters, provided as arguments
     * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html#handleArguments-java.lang.String:A-">X3D.handleArguments(args)</a>
     * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html#validationReport--">X3D.validationReport()</a>
     * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/CommandLine.html">CommandLine</a>
     * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/CommandLine.html#USAGE">CommandLine.USAGE</a>
     * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/ConfigurationProperties.html">ConfigurationProperties</a>
     */
    public static void main(String args[])
    {
        System.out.println("Build this X3D model, showing validation diagnostics...");
        X3D thisExampleX3dModel = new Figure15_17WigglingSnakeWithAxes().getX3dModel();
//      System.out.println("X3D model construction complete.");
	
        // next handle command line arguments
        boolean hasArguments = (args != null) && (args.length > 0);
        boolean validate = true; // default
        boolean argumentsLoadNewModel = false;
        String  fileName = new String();

        if (args != null)
        {
                for (String arg : args)
                {
                        if (arg.toLowerCase().startsWith("-v") || arg.toLowerCase().contains("validate"))
                        {
                                validate = true; // making sure
                        }
                        if (arg.toLowerCase().endsWith(X3D.FILE_EXTENSION_X3D) ||
                                arg.toLowerCase().endsWith(X3D.FILE_EXTENSION_CLASSICVRML) ||
                                arg.toLowerCase().endsWith(X3D.FILE_EXTENSION_X3DB) ||
                                arg.toLowerCase().endsWith(X3D.FILE_EXTENSION_VRML97) ||
                                arg.toLowerCase().endsWith(X3D.FILE_EXTENSION_EXI) ||
                                arg.toLowerCase().endsWith(X3D.FILE_EXTENSION_GZIP) ||
                                arg.toLowerCase().endsWith(X3D.FILE_EXTENSION_ZIP) ||
                                arg.toLowerCase().endsWith(X3D.FILE_EXTENSION_HTML) ||
                                arg.toLowerCase().endsWith(X3D.FILE_EXTENSION_XHTML))
                        {
                                argumentsLoadNewModel = true;
                                fileName = arg;
                        }
                }
        }
        if      (argumentsLoadNewModel)
                System.out.println("WARNING: \"Vrml2Sourcebook.Chapter15Extrusion.Figure15_17WigglingSnakeWithAxes\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
        else if (hasArguments) // if no arguments provided, this method produces usage warning
                thisExampleX3dModel.handleArguments(args);
	
        if (validate)
        {
            //  System.out.println("--- TODO fix duplicated outputs ---"); // omit when duplicated outputs problem is solved/refactored
		String validationResults = thisExampleX3dModel.validationReport();
            //  System.out.println("-----------------------------------"); // omit when duplicated outputs problem is solved/refactored
                System.out.print("Vrml2Sourcebook.Chapter15Extrusion.Figure15_17WigglingSnakeWithAxes self-validation test results: ");
                if (!validationResults.equals("success"))
                    System.out.println();
                System.out.println(validationResults.trim());
        }
    }
}
