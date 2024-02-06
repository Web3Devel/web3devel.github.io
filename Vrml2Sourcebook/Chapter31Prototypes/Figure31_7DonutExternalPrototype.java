package Vrml2Sourcebook.Chapter31Prototypes;

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
import org.web3d.x3d.jsail.Grouping.*;
import org.web3d.x3d.jsail.Interpolation.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.PointingDeviceSensor.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Texturing.*;
import org.web3d.x3d.jsail.Time.*;

// Javadoc metadata annotations follow, see below for X3DJSAIL Java source code.
/**
 * <p> A donut shape built using prototypes: the Donut geometry node and the LightOak appearance node. Also see Figures 30.5 and 31.6 for comparison. </p>
 <p> Related links: <a href="../../../Chapter31Prototypes/Figure31_7DonutExternalPrototype.java">Figure31_7DonutExternalPrototype.java</a> source, <a href="../../../Chapter31Prototypes/Figure31_7DonutExternalPrototypeIndex.html" target="_top">Figure31_7DonutExternalPrototype catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter31Prototypes/Figure31_7DonutExternalPrototype.x3d">Figure31_7DonutExternalPrototype.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Figure 31.7, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://www.wiley.com/legacy/compbooks/vrml2sbk/ch31/31fig07.htm" target="_blank">http://www.wiley.com/legacy/compbooks/vrml2sbk/ch31/31fig07.htm</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> translator </i> </td>
			<td> Don Brutzman </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 22 November 2000 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 16 December 2023 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> A donut shape built using prototypes: the Donut geometry node and the LightOak appearance node. Also see Figures 30.5 and 31.6 for comparison. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter31Prototypes/Figure31_7DonutExternalPrototype.x3d" target="_blank">https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter31Prototypes/Figure31_7DonutExternalPrototype.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> X3D-Edit 3.3, <a href="https://savage.nps.edu/X3D-Edit" target="_blank">https://savage.nps.edu/X3D-Edit</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> license </i> </td>
			<td> <a href="../../../Chapter31Prototypes/../../license.html">../../license.html</a> </td>
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

	* @author Figure 31.7, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland
 */

public class Figure31_7DonutExternalPrototype
{
	/** Default constructor to create this object. */
	public Figure31_7DonutExternalPrototype ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
            try { // catch-all
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_0)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("Figure31_7DonutExternalPrototype.x3d"))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Figure 31.7, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.wiley.com/legacy/compbooks/vrml2sbk/ch31/31fig07.htm"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATOR ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("22 November 2000"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("16 December 2023"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("A donut shape built using prototypes: the Donut geometry node and the LightOak appearance node. Also see Figures 30.5 and 31.6 for comparison."))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter31Prototypes/Figure31_7DonutExternalPrototype.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("Figure31_7DonutExternalPrototype.x3d"))
    .addChild(new ExternProtoDeclare("Donut").setName("Donut").setUrl(new String[] {"Figure31_6DonutPrototype.wrl#Donut","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter31Prototypes/Figure31_6DonutPrototype.wrl#Donut","Figure31_6DonutPrototype.x3d#Donut","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter31Prototypes/Figure31_6DonutPrototype.x3d#Donut"})
      .addField(new field().setName("crossSectionRadius").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INITIALIZEONLY))
      .addField(new field().setName("spineRadius").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INITIALIZEONLY))
      .addField(new field().setName("crossSectionResolution").setType(field.TYPE_SFINT32).setAccessType(field.ACCESSTYPE_INITIALIZEONLY))
      .addField(new field().setName("spineResolution").setType(field.TYPE_SFINT32).setAccessType(field.ACCESSTYPE_INITIALIZEONLY))
      .addField(new field().setName("set_crossSectionRadius").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INPUTONLY))
      .addField(new field().setName("set_spineRadius").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INPUTONLY)))
    .addChild(new ExternProtoDeclare("LightOak").setName("LightOak").setUrl(new String[] {"Figure31_4WoodAppearancePrototypesLibrary.wrl#LightOak","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter31Prototypes/Figure31_4WoodAppearancePrototypesLibrary.wrl#LightOak","Figure31_4WoodAppearancePrototypesLibrary.x3d#LightOak","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter31Prototypes/Figure31_4WoodAppearancePrototypesLibrary.x3d#LightOak"})
      .addField(new field().setName("textureTransform").setType(field.TYPE_SFNODE).setAccessType(field.ACCESSTYPE_INPUTOUTPUT)))
    .addChild(new Viewpoint().setDescription("Click to pick a size").setOrientation(1.0,0.0,0.0,-0.52).setPosition(0.0,7.0,12.0))
    .addComments(" Donut instances from prototypes ")
    .addChild(new Transform().setTranslation(0.0,2.0,0.0)
      .addChild(new Shape()
        .setGeometry(new ProtoInstance("Donut").setContainerField("geometry")
          .addFieldValue(new fieldValue().setName("crossSectionRadius").setValue(1))
          .addFieldValue(new fieldValue().setName("spineRadius").setValue(2)))
        .setAppearance(new ProtoInstance("LightOak").setContainerField("appearance")
          .addFieldValue(new fieldValue().setName("textureTransform")
            .addChild(new TextureTransform().setCenter(-0.0,5.0).setRotation(0.758).setScale(2.0,0.5).setTranslation(0.5,0.0))))))
    .addComments(" Hmmm, what size donut do you really want? ")
    .addChild(new TimeSensor("Clock").setCycleInterval(10).setLoop(true))
    .addChild(new ScalarInterpolator("DonutThickness").setKey(new double[] {0.0,0.4,0.5,0.9,1.0}).setKeyValue(new double[] {0.75,1.25,1.25,0.75,0.75}))
    .addChild(new Transform().setTranslation(0.0,-2.0,0.0)
      .addChild(new Shape()
        .setGeometry(new ProtoInstance("Donut", "SpecialtyOfTheHouse").setContainerField("geometry")
          .addFieldValue(new fieldValue().setName("crossSectionRadius").setValue(0.5))
          .addFieldValue(new fieldValue().setName("spineRadius").setValue(2)))
        .setAppearance(new Appearance()
          .setTexture(new ImageTexture().setUrl(new String[] {"../Chapter17Textures/icing.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter17Textures/icing.jpg"}))))
      .addChild(new TouchSensor("StopSizeChanges").setDescription("touch to stop size changes")))
    .addChild(new ROUTE().setFromNode("Clock").setFromField("fraction_changed").setToNode("DonutThickness").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("DonutThickness").setFromField("value_changed").setToNode("SpecialtyOfTheHouse").setToField("crossSectionRadius"))
    .addChild(new ROUTE().setFromNode("StopSizeChanges").setFromField("touchTime").setToNode("Clock").setToField("stopTime")));
            }
            catch (Exception ex)
            {       
                System.err.println ("*** Further hints on X3DJSAIL errors and exceptions at");
                System.err.println ("*** https://www.web3d.org/specifications/java/X3DJSAIL.html");
                throw (ex);
            }
	}
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return Figure31_7DonutExternalPrototype model
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
        X3D thisExampleX3dModel = new Figure31_7DonutExternalPrototype().getX3dModel();
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
                System.out.println("WARNING: \"Vrml2Sourcebook.Chapter31Prototypes.Figure31_7DonutExternalPrototype\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
        else if (hasArguments) // if no arguments provided, this method produces usage warning
                thisExampleX3dModel.handleArguments(args);
	
        if (validate)
        {
            //  System.out.println("--- TODO fix duplicated outputs ---"); // omit when duplicated outputs problem is solved/refactored
		String validationResults = thisExampleX3dModel.validationReport();
            //  System.out.println("-----------------------------------"); // omit when duplicated outputs problem is solved/refactored
                System.out.print("Vrml2Sourcebook.Chapter31Prototypes.Figure31_7DonutExternalPrototype self-validation test results: ");
                if (!validationResults.equals("success"))
                    System.out.println();
                System.out.println(validationResults.trim());
        }
    }
}
