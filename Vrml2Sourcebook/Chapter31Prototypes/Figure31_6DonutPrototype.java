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
import org.web3d.x3d.jsail.Geometry3D.*;
import org.web3d.x3d.jsail.Networking.*;
import org.web3d.x3d.jsail.Scripting.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Text.*;

// Javadoc metadata annotations follow, see below for X3DJSAIL Java source code.
/**
 * <p> A donut (torus) node prototype. Also see Figures 30.5 and 31.7 for comparison. </p>
 <p> Related links: <a href="../../../Chapter31Prototypes/Figure31_6DonutPrototype.java">Figure31_6DonutPrototype.java</a> source, <a href="../../../Chapter31Prototypes/Figure31_6DonutPrototypeIndex.html" target="_top">Figure31_6DonutPrototype catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter31Prototypes/Figure31_6DonutPrototype.x3d">Figure31_6DonutPrototype.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Figure 31.6, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://www.wiley.com/legacy/compbooks/vrml2sbk/ch31/31fig06.htm" target="_blank">http://www.wiley.com/legacy/compbooks/vrml2sbk/ch31/31fig06.htm</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> translator </i> </td>
			<td> Don Brutzman </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 30 March 2001 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> A donut (torus) node prototype. Also see Figures 30.5 and 31.7 for comparison. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter31Prototypes/Figure31_6DonutPrototype.x3d" target="_blank">https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter31Prototypes/Figure31_6DonutPrototype.x3d</a> </td>
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

	* @author Figure 31.6, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland
 */

public class Figure31_6DonutPrototype
{
	/** Default constructor to create this object. */
	public Figure31_6DonutPrototype ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
            try { // catch-all
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_0)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("Figure31_6DonutPrototype.x3d"))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Figure 31.6, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.wiley.com/legacy/compbooks/vrml2sbk/ch31/31fig06.htm"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATOR ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("30 March 2001"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("A donut (torus) node prototype. Also see Figures 30.5 and 31.7 for comparison."))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter31Prototypes/Figure31_6DonutPrototype.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("Figure31_6DonutPrototype.x3d"))
    .addChild(new ProtoDeclare("Donut").setName("Donut")
      .setProtoInterface(new ProtoInterface()
        .addField(new field().setName("crossSectionRadius").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setValue(1))
        .addField(new field().setName("spineRadius").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setValue(2))
        .addField(new field().setName("crossSectionResolution").setType(field.TYPE_SFINT32).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setValue(16))
        .addField(new field().setName("spineResolution").setType(field.TYPE_SFINT32).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setValue(16))
        .addField(new field().setName("set_crossSectionRadius").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INPUTONLY))
        .addField(new field().setName("set_spineRadius").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INPUTONLY)))
      .setProtoBody(new ProtoBody()
        .addChild(new Extrusion("DonutExtrusion").setBeginCap(false).setCreaseAngle(1.57).setEndCap(false))
        .addComments(" Donut maker creates torus on initialization - external script. Modified script to add endpoints matching startpoints. ")
        .addChild(new Script("DonutMakerInternalScript").setSourceCode("""
ecmascript:

function initialize( ) {
    generateCrossSection( );
    generateSpine( );
}

function set_crossSectionRadius( csr, ts )
{
    crossSectionRadius = csr;
//  Browser.println ('crossSectionRadius =' + crossSectionRadius);
    generateCrossSection( );
}

function set_spineRadius( sr, ts )
{
    spineRadius = sr;
//  Browser.println ('spineRadius =' + spineRadius);
    generateSpine( );
}

function generateCrossSection( )
{
    newCrossSection = new MFVec2f(); // temporary hold variable
    angle = 0.0;
    delta = 6.28 / crossSectionResolution;
    for ( i = 0; i <= crossSectionResolution + 1; i++ ) {
        newCrossSection[i][0] =  crossSectionRadius * Math.cos( angle );
        newCrossSection[i][1] = -crossSectionRadius * Math.sin( angle );
        angle += delta;
    }
    // make ends meet
    newCrossSection[crossSectionResolution + 1][0] = newCrossSection[0][0];
    newCrossSection[crossSectionResolution + 1][1] = newCrossSection[0][1];

    crossSection_changed = newCrossSection;
}

function generateSpine( )
{
    newSpine = new MFVec3f(); // temporary hold variable
    angle = 0.0;
    delta = (2 * 3.141592653) / spineResolution;
    for ( i = 0; i <= spineResolution; i++ ) {
        newSpine[i][0] = spineRadius * Math.cos( angle );
        newSpine[i][1] = 0.0;
        newSpine[i][2] = -spineRadius * Math.sin( angle );
        angle += delta;
    }
    // make ends meet
    newSpine[spineResolution + 1][0] = newSpine[0][0];
    newSpine[spineResolution + 1][1] = 0.0;
    newSpine[spineResolution + 1][2] = newSpine[0][2];

    spine_changed = newSpine;
}
""")
          .addField(new field().setName("crossSectionRadius").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INITIALIZEONLY))
          .addField(new field().setName("spineRadius").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INITIALIZEONLY))
          .addField(new field().setName("crossSectionResolution").setType(field.TYPE_SFINT32).setAccessType(field.ACCESSTYPE_INITIALIZEONLY))
          .addField(new field().setName("spineResolution").setType(field.TYPE_SFINT32).setAccessType(field.ACCESSTYPE_INITIALIZEONLY))
          .addField(new field().setName("set_crossSectionRadius").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INPUTONLY))
          .addField(new field().setName("set_spineRadius").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INPUTONLY))
          .addField(new field().setName("crossSection_changed").setType(field.TYPE_MFVEC2F).setAccessType(field.ACCESSTYPE_OUTPUTONLY))
          .addField(new field().setName("spine_changed").setType(field.TYPE_MFVEC3F).setAccessType(field.ACCESSTYPE_OUTPUTONLY))
          .setIS(new IS()
            .addConnect(new connect().setNodeField("crossSectionRadius").setProtoField("crossSectionRadius"))
            .addConnect(new connect().setNodeField("spineRadius").setProtoField("spineRadius"))
            .addConnect(new connect().setNodeField("crossSectionResolution").setProtoField("crossSectionResolution"))
            .addConnect(new connect().setNodeField("spineResolution").setProtoField("spineResolution"))
            .addConnect(new connect().setNodeField("set_crossSectionRadius").setProtoField("set_crossSectionRadius"))
            .addConnect(new connect().setNodeField("set_spineRadius").setProtoField("set_spineRadius"))))
        .addChild(new ROUTE().setFromNode("DonutMakerInternalScript").setFromField("spine_changed").setToNode("DonutExtrusion").setToField("set_spine"))
        .addChild(new ROUTE().setFromNode("DonutMakerInternalScript").setFromField("crossSection_changed").setToNode("DonutExtrusion").setToField("set_crossSection"))))
    .addComments(" It is a good practice to include default message linking to an example scene, in case a user tries to view this Prototype library directly. ")
    .addChild(new Anchor().setDescription("Figure31_7DonutExternalPrototype example").setParameter(new String[] {"target=_blank"}).setUrl(new String[] {"Figure31_7DonutExternalPrototype.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter31Prototypes/Figure31_7DonutExternalPrototype.x3d","Figure31_7DonutExternalPrototype.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter31Prototypes/Figure31_7DonutExternalPrototype.wrl"})
      .addChild(new Shape()
        .setGeometry(new Text().setString(new String[] {"Figure31_6DonutPrototype","contains a prototype definition","","Click on text to see a Donut in","Figure31_7DonutExternalPrototype"})
          .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.8)))
        .setAppearance(new Appearance()
          .setMaterial(new Material().setDiffuseColor(0.0,0.6,0.6))))));
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
	 * @return Figure31_6DonutPrototype model
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
        X3D thisExampleX3dModel = new Figure31_6DonutPrototype().getX3dModel();
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
                System.out.println("WARNING: \"Vrml2Sourcebook.Chapter31Prototypes.Figure31_6DonutPrototype\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
        else if (hasArguments) // if no arguments provided, this method produces usage warning
                thisExampleX3dModel.handleArguments(args);
	
        if (validate)
        {
            //  System.out.println("--- TODO fix duplicated outputs ---"); // omit when duplicated outputs problem is solved/refactored
		String validationResults = thisExampleX3dModel.validationReport();
            //  System.out.println("-----------------------------------"); // omit when duplicated outputs problem is solved/refactored
                System.out.print("Vrml2Sourcebook.Chapter31Prototypes.Figure31_6DonutPrototype self-validation test results: ");
                if (!validationResults.equals("success"))
                    System.out.println();
                System.out.println(validationResults.trim());
        }
    }
}
