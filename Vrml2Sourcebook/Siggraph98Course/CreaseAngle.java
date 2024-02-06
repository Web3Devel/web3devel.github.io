package Vrml2Sourcebook.Siggraph98Course;

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
import org.web3d.x3d.jsail.Lighting.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.PointingDeviceSensor.*;
import org.web3d.x3d.jsail.Rendering.*;
import org.web3d.x3d.jsail.Scripting.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Text.*;

// Javadoc metadata annotations follow, see below for X3DJSAIL Java source code.
/**
 * <p> creaseAngle demonstration: select and drag upper halves of quadrilaterals to change creaseAngle and shading. </p>
 <p> Related links: <a href="../../../Siggraph98Course/CreaseAngle.java">CreaseAngle.java</a> source, <a href="../../../Siggraph98Course/CreaseAngleIndex.html" target="_top">CreaseAngle catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Siggraph98Course/CreaseAngle.x3d">CreaseAngle.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> creaseAngle demonstration: select and drag upper halves of quadrilaterals to change creaseAngle and shading. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> John L. Moreland </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> translator </i> </td>
			<td> Don Brutzman </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 1 July 1998 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> translated </i> </td>
			<td> 2 February 2014 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> originals/creangle.wrl </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://www.siggraph.org/s98" target="_blank">http://www.siggraph.org/s98</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://www.siggraph.org/s98/conference/courses/18.html" target="_blank">http://www.siggraph.org/s98/conference/courses/18.html</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0243.htm" target="_blank">http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0243.htm</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm" target="_blank">http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">https://www.web3d.org/x3d/content/examples/X3dResources.html</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/CreaseAngle.x3d" target="_blank">https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/CreaseAngle.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> Vrml97ToX3dNist, <a href="http://ovrt.nist.gov/v2_x3d.html" target="_blank">http://ovrt.nist.gov/v2_x3d.html</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> X3D-Edit, <a href="https://savage.nps.edu/X3D-Edit" target="_blank">https://savage.nps.edu/X3D-Edit</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> license </i> </td>
			<td> <a href="../../../Siggraph98Course/../license.html">../license.html</a> </td>
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

	* @author John L. Moreland
 */

public class CreaseAngle
{
	/** Default constructor to create this object. */
	public CreaseAngle ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
            try { // catch-all
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("CreaseAngle.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("creaseAngle demonstration: select and drag upper halves of quadrilaterals to change creaseAngle and shading."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("John L. Moreland"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATOR ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("1 July 1998"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATED ).setContent("2 February 2014"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("originals/creangle.wrl"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.siggraph.org/s98"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.siggraph.org/s98/conference/courses/18.html"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0243.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://www.web3d.org/x3d/content/examples/X3dResources.html"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/CreaseAngle.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setInfo(new String[] {"copyright (c) 1997, John L. Moreland"}).setTitle("Crease angle demonstration"))
    .addChild(new Viewpoint().setDescription("Front Face").setCenterOfRotation(0.0,0.85,0.0).setOrientation(0.0,1.0,0.0,-0.62).setPosition(-2.0,0.85,3.0))
    .addChild(new Viewpoint().setDescription("Back Face").setCenterOfRotation(0.0,0.85,0.0).setOrientation(0.0,1.0,0.0,0.62).setPosition(2.4,0.85,3.0))
    .addChild(new NavigationInfo())
    .addChild(new DirectionalLight().setColor(1.0,0.0,0.0).setDirection(0.0,-1.0,0.1))
    .addChild(new DirectionalLight().setColor(0.0,0.0,1.0).setDirection(0.0,1.0,-0.1))
    .addChild(new Transform().setTranslation(-1.1,0.0,0.0)
      .addChild(new Shape()
        .setAppearance(new Appearance("White")
          .setMaterial(new Material().setAmbientIntensity(0.5).setDiffuseColor(1.0,1.0,1.0)))
        .setGeometry(new IndexedFaceSet().setSolid(false).setCoordIndex(new int[] {0,1,4,5,0,-1,1,2,3,4,1,-1})
          .setCoord(new Coordinate("Crd1").setPoint(new MFVec3f(new double[] {0.0,0.0,1.0,0.0,1.0,1.0,0.0,2.0,1.0,0.0,2.0,-1.0,0.0,1.0,-1.0,0.0,0.0,-1.0})))))
      .addChild(new Transform().setTranslation(0.0,1.0,1.2)
        .addChild(new Billboard()
          .addChild(new Shape()
            .setAppearance(new Appearance("FntColor")
              .setMaterial(new Material().setDiffuseColor(1.0,0.0,0.0)))
            .setGeometry(new Text().setString(new String[] {"0.0"})
              .setFontStyle(new FontStyle("FntStyle").setJustify(FontStyle.JUSTIFY_BEGIN_MIDDLE).setSize(0.1).setCssStyle("BOLD"))))
          .addChild(new Transform("bendAngleLabel").setTranslation(0.0,-0.1,0.0)
            .addChild(new Shape()
              .setAppearance(new Appearance()
                .setMaterial(new Material().setDiffuseColor(0.0,0.5,0.0)))
              .setGeometry(new Text("bendAngle").setString(new String[] {"0.0"})
                .setFontStyle(new FontStyle().setUSE("FntStyle"))))))))
    .addChild(new Transform()
      .addChild(new Shape()
        .setAppearance(new Appearance().setUSE("White"))
        .setGeometry(new IndexedFaceSet().setCreaseAngle(0.785).setSolid(false).setCoordIndex(new int[] {0,1,4,5,0,-1,1,2,3,4,1,-1})
          .setCoord(new Coordinate("Crd2").setPoint(new MFVec3f(new double[] {0.0,0.0,1.0,0.0,1.0,1.0,0.0,2.0,1.0,0.0,2.0,-1.0,0.0,1.0,-1.0,0.0,0.0,-1.0})))))
      .addChild(new Transform().setTranslation(0.0,1.0,1.2)
        .addChild(new Billboard()
          .addChild(new Shape()
            .setAppearance(new Appearance().setUSE("FntColor"))
            .setGeometry(new Text().setString(new String[] {"0.785"})
              .setFontStyle(new FontStyle().setUSE("FntStyle"))))
          .addChild(new Transform().setUSE("bendAngleLabel")))))
    .addChild(new Transform().setTranslation(1.1,0.0,0.0)
      .addChild(new Shape()
        .setAppearance(new Appearance().setUSE("White"))
        .setGeometry(new IndexedFaceSet().setCreaseAngle(1.57).setSolid(false).setCoordIndex(new int[] {0,1,4,5,0,-1,1,2,3,4,1,-1})
          .setCoord(new Coordinate("Crd3").setPoint(new MFVec3f(new double[] {0.0,0.0,1.0,0.0,1.0,1.0,0.0,2.0,1.0,0.0,2.0,-1.0,0.0,1.0,-1.0,0.0,0.0,-1.0})))))
      .addChild(new Transform().setTranslation(0.0,1.0,1.2)
        .addChild(new Billboard()
          .addChild(new Shape()
            .setAppearance(new Appearance().setUSE("FntColor"))
            .setGeometry(new Text().setString(new String[] {"1.57"})
              .setFontStyle(new FontStyle().setUSE("FntStyle"))))
          .addChild(new Transform().setUSE("bendAngleLabel")))))
    .addChild(new PlaneSensor("PS").setDescription("Select and drag upper halves of quads to change creaseAngle and shading").setMaxPosition(6.283,1.57))
    .addChild(new Script("Scr").setSourceCode("""
ecmascript:
        function set_translation( tran, et )
        {
            tempCA = tran[0] / 4.0;
            if ( tempCA < 0.00 ) tempCA = 0.0;
            if ( tempCA > 1.57 ) tempCA = 1.57;
            fraction_changed = tempCA;
            // Hacks to get truncation/formatting
            tempCA = (Math.floor(tempCA*1000)/1000.0);
            if ( (tempCA > 0.1) && (tempCA < 1.0) )
                tempCA = '0' + tempCA;
            if ( tempCA <= 0.0 )
                tempCA = tempCA + '.' + '0';
            label_changed[0] = tempCA;
        }
""")
      .addField(new field().setName("label_changed").setType(field.TYPE_MFSTRING).setAccessType(field.ACCESSTYPE_OUTPUTONLY))
      .addField(new field().setName("set_translation").setType(field.TYPE_SFVEC3F).setAccessType(field.ACCESSTYPE_INPUTONLY))
      .addField(new field().setName("fraction_changed").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_OUTPUTONLY)))
    .addChild(new CoordinateInterpolator("CI").setKey(new double[] {0.0,1.57}).setKeyValue(new MFVec3f(new double[] {0.0,0.0,1.0,0.0,1.0,1.0,0.0,2.0,1.0,0.0,2.0,-1.0,0.0,1.0,-1.0,0.0,0.0,-1.0,0.0,0.0,1.0,0.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,-1.0,0.0,1.0,-1.0,0.0,0.0,-1.0})))
    .addChild(new ROUTE().setFromNode("PS").setFromField("translation_changed").setToNode("Scr").setToField("set_translation"))
    .addChild(new ROUTE().setFromNode("Scr").setFromField("fraction_changed").setToNode("CI").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Scr").setFromField("label_changed").setToNode("bendAngle").setToField("set_string"))
    .addChild(new ROUTE().setFromNode("CI").setFromField("value_changed").setToNode("Crd1").setToField("set_point"))
    .addChild(new ROUTE().setFromNode("CI").setFromField("value_changed").setToNode("Crd2").setToField("set_point"))
    .addChild(new ROUTE().setFromNode("CI").setFromField("value_changed").setToNode("Crd3").setToField("set_point")));
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
	 * @return CreaseAngle model
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
        X3D thisExampleX3dModel = new CreaseAngle().getX3dModel();
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
                System.out.println("WARNING: \"Vrml2Sourcebook.Siggraph98Course.CreaseAngle\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
        else if (hasArguments) // if no arguments provided, this method produces usage warning
                thisExampleX3dModel.handleArguments(args);
	
        if (validate)
        {
            //  System.out.println("--- TODO fix duplicated outputs ---"); // omit when duplicated outputs problem is solved/refactored
		String validationResults = thisExampleX3dModel.validationReport();
            //  System.out.println("-----------------------------------"); // omit when duplicated outputs problem is solved/refactored
                System.out.print("Vrml2Sourcebook.Siggraph98Course.CreaseAngle self-validation test results: ");
                if (!validationResults.equals("success"))
                    System.out.println();
                System.out.println(validationResults.trim());
        }
    }
}
