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
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.Shape.*;

// Javadoc metadata annotations follow, see below for X3DJSAIL Java source code.
/**
 * <p> A fairy-tale castle atop a green hill with a blue sky behind. There are no animations or fun things to click on... building those is up to you. </p>
 <p> Related links: <a href="../../../Siggraph98Course/Castle.java">Castle.java</a> source, <a href="../../../Siggraph98Course/CastleIndex.html" target="_top">Castle catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Siggraph98Course/Castle.x3d">Castle.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> A fairy-tale castle atop a green hill with a blue sky behind. There are no animations or fun things to click on... building those is up to you. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> David R. Nadeau </td>
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
			<td> originals/castle.wrl </td>
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
			<td> <a href="http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0000.htm" target="_blank">http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0000.htm</a> </td>
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
			<td> <a href="https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Castle.x3d" target="_blank">https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Castle.x3d</a> </td>
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

	* @author David R. Nadeau
 */

public class Castle
{
	/** Default constructor to create this object. */
	public Castle ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
            try { // catch-all
  x3dModel = new X3D().setProfile(X3D.PROFILE_INTERCHANGE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("Castle.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("A fairy-tale castle atop a green hill with a blue sky behind. There are no animations or fun things to click on... building those is up to you."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("David R. Nadeau"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATOR ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("1 July 1998"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATED ).setContent("2 February 2014"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("originals/castle.wrl"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.siggraph.org/s98"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.siggraph.org/s98/conference/courses/18.html"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0000.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://www.web3d.org/x3d/content/examples/X3dResources.html"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Castle.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addComments(" This world illustrates how far you can go using the primitive geometry nodes: Box, Cone, and Cylinder. An entire fairy-tale castle is built by translating and rotating these shapes into position. ")
    .addComments(" Things to experiment with... ")
    .addComments(" Change the color scheme to make the castle an evil lair. ")
    .addComments(" Add texture maps to make the castle walls look like they are built from stone. ")
    .addComments(" Make the castle door an anchor. Clicking on the door leads to another world describing the castle interior. ")
    .addComments(" Add panorama cloud and mountain textures to the Background node. ")
    .addComments(" In Nintendo 64 style, add platforms that rise and fall and cannons that rise up when you approach. You can build these using PositionInterpolators and TimeSensors to run the animations, and ProximitySensors to trigger the actions. ")
    .addChild(new WorldInfo().setInfo(new String[] {"copyright (c) 1997, David R. Nadeau"}).setTitle("Fairy-tale Castle"))
    .addChild(new Viewpoint().setDescription("Entry view").setOrientation(1.0,0.0,0.0,0.35))
    .addChild(new NavigationInfo().setSpeed(40.0))
    .addChild(new Transform().setTranslation(0.0,-1.6,0.0)
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material().setDiffuseColor(0.0,0.0,0.0).setEmissiveColor(0.0,0.5,0.0)))
        .setGeometry(new Box().setSize(2000.0,0.01,2000.0))))
    .addChild(new Transform("Castle").setTranslation(0.0,-1.6,-200.0)
      .addChild(new Transform().setTranslation(0.0,20.0,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance("CastleColor")
            .setMaterial(new Material().setAmbientIntensity(0.5).setDiffuseColor(1.0,1.0,1.0)))
          .setGeometry(new Cylinder().setBottom(false).setHeight(40.0).setRadius(50.0))))
      .addChild(new Transform().setTranslation(0.0,0.0,52.0)
        .addChild(new Transform().setTranslation(0.0,10.0,0.0)
          .addChild(new Shape()
            .setAppearance(new Appearance().setUSE("CastleColor"))
            .setGeometry(new Box().setSize(30.0,20.0,6.0))))
        .addChild(new Transform().setTranslation(0.0,5.0,3.0)
          .addChild(new Shape()
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(0.4,0.1,0.0)))
            .setGeometry(new Box().setSize(10.0,10.0,0.5))))
        .addChild(new Transform().setTranslation(-15.0,0.0,3.0)
          .addChild(new Transform("EntryTower").setTranslation(0.0,15.0,0.0)
            .addChild(new Shape()
              .setAppearance(new Appearance().setUSE("CastleColor"))
              .setGeometry(new Cylinder().setBottom(false).setHeight(30.0).setRadius(5.0).setTop(false))))
          .addChild(new Transform("EntryRoof").setTranslation(0.0,40.0,0.0)
            .addChild(new Shape()
              .setAppearance(new Appearance("RoofColor")
                .setMaterial(new Material().setAmbientIntensity(0.5).setDiffuseColor(1.0,0.0,0.0)))
              .setGeometry(new Cone().setBottomRadius(8.0).setHeight(20.0)))))
        .addChild(new Transform().setTranslation(15.0,0.0,3.0)
          .addChild(new Transform().setUSE("EntryTower"))
          .addChild(new Transform().setUSE("EntryRoof"))))
      .addChild(new Transform().setTranslation(-15.0,40.0,-5.0)
        .addChild(new Transform().setTranslation(0.0,30.0,0.0)
          .addChild(new Shape()
            .setAppearance(new Appearance().setUSE("CastleColor"))
            .setGeometry(new Cylinder().setBottom(false).setHeight(60.0).setRadius(25.0))))
        .addChild(new Transform().setTranslation(0.0,100.0,0.0)
          .addChild(new Shape()
            .setAppearance(new Appearance().setUSE("CastleColor"))
            .setGeometry(new Cylinder().setBottom(false).setHeight(80.0).setRadius(15.0).setTop(false))))
        .addChild(new Transform().setTranslation(0.0,170.0,0.0)
          .addChild(new Shape("MainRoofCone")
            .setAppearance(new Appearance().setUSE("RoofColor"))
            .setGeometry(new Cone().setBottomRadius(23.0).setHeight(60.0)))))
      .addChild(new Transform().setTranslation(20.0,40.0,15.0)
        .addChild(new Transform().setTranslation(0.0,50.0,0.0)
          .addChild(new Shape()
            .setAppearance(new Appearance().setUSE("CastleColor"))
            .setGeometry(new Cylinder().setBottom(false).setHeight(100.0).setRadius(15.0).setTop(false))))
        .addChild(new Transform().setTranslation(0.0,130.0,0.0)
          .addChild(new Shape().setUSE("MainRoofCone")))
        .addChild(new Transform().setTranslation(0.0,30.0,15.0)
          .addChild(new Transform("SmallSubTower").setTranslation(0.0,25.0,0.0)
            .addChild(new Shape()
              .setAppearance(new Appearance().setUSE("CastleColor"))
              .setGeometry(new Cylinder().setBottom(false).setHeight(30.0).setRadius(5.0).setTop(false))))
          .addChild(new Transform("SmallSubBase").setRotation(1.0,0.0,0.0,3.14159).setTranslation(0.0,5.0,0.0)
            .addChild(new Shape()
              .setAppearance(new Appearance().setUSE("CastleColor"))
              .setGeometry(new Cone().setBottom(false).setBottomRadius(5.0).setHeight(10.0))))
          .addChild(new Transform("SmallSubRoof").setTranslation(0.0,50.0,0.0)
            .addChild(new Shape()
              .setAppearance(new Appearance().setUSE("RoofColor"))
              .setGeometry(new Cone().setBottomRadius(8.0).setHeight(20.0))))))
      .addChild(new Transform().setTranslation(50.0,20.0,0.0)
        .addChild(new Transform("LargeSubTower").setTranslation(0.0,60.0,0.0)
          .addChild(new Shape()
            .setAppearance(new Appearance().setUSE("CastleColor"))
            .setGeometry(new Cylinder().setBottom(false).setHeight(80.0).setRadius(10.0).setTop(false))))
        .addChild(new Transform("LargeSubBase").setRotation(1.0,0.0,0.0,3.14159).setTranslation(0.0,10.0,0.0)
          .addChild(new Shape()
            .setAppearance(new Appearance().setUSE("CastleColor"))
            .setGeometry(new Cone().setBottom(false).setBottomRadius(10.0).setHeight(20.0))))
        .addChild(new Transform("LargeSubRoof").setTranslation(0.0,120.0,0.0)
          .addChild(new Shape()
            .setAppearance(new Appearance().setUSE("RoofColor"))
            .setGeometry(new Cone().setBottomRadius(15.0).setHeight(40.0))))
        .addChild(new Transform().setTranslation(10.0,40.0,0.0)
          .addChild(new Transform().setUSE("SmallSubTower"))
          .addChild(new Transform().setUSE("SmallSubBase"))
          .addChild(new Transform().setUSE("SmallSubRoof"))))
      .addChild(new Transform().setTranslation(-35.36,20.0,35.36)
        .addChild(new Transform().setUSE("LargeSubTower"))
        .addChild(new Transform().setUSE("LargeSubBase"))
        .addChild(new Transform().setUSE("LargeSubRoof"))
        .addChild(new Transform().setTranslation(-7.07,40.0,7.07)
          .addChild(new Transform().setUSE("SmallSubTower"))
          .addChild(new Transform().setUSE("SmallSubBase"))
          .addChild(new Transform().setUSE("SmallSubRoof"))))
      .addChild(new Transform().setTranslation(0.0,20.0,-50.0)
        .addChild(new Transform().setUSE("LargeSubTower"))
        .addChild(new Transform().setUSE("LargeSubBase"))
        .addChild(new Transform().setUSE("LargeSubRoof"))
        .addChild(new Transform().setTranslation(0.0,40.0,-10.0)
          .addChild(new Transform().setUSE("SmallSubTower"))
          .addChild(new Transform().setUSE("SmallSubBase"))
          .addChild(new Transform().setUSE("SmallSubRoof"))))));
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
	 * @return Castle model
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
        X3D thisExampleX3dModel = new Castle().getX3dModel();
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
                System.out.println("WARNING: \"Vrml2Sourcebook.Siggraph98Course.Castle\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
        else if (hasArguments) // if no arguments provided, this method produces usage warning
                thisExampleX3dModel.handleArguments(args);
	
        if (validate)
        {
            //  System.out.println("--- TODO fix duplicated outputs ---"); // omit when duplicated outputs problem is solved/refactored
		String validationResults = thisExampleX3dModel.validationReport();
            //  System.out.println("-----------------------------------"); // omit when duplicated outputs problem is solved/refactored
                System.out.print("Vrml2Sourcebook.Siggraph98Course.Castle self-validation test results: ");
                if (!validationResults.equals("success"))
                    System.out.println();
                System.out.println(validationResults.trim());
        }
    }
}
