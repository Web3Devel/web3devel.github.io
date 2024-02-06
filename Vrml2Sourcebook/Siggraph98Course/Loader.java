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
import org.web3d.x3d.jsail.EnvironmentalEffects.*;
import org.web3d.x3d.jsail.fields.*;
import org.web3d.x3d.jsail.Grouping.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.Scripting.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Text.*;

// Javadoc metadata annotations follow, see below for X3DJSAIL Java source code.
/**
 * <p> This example illustrates use of JavaScript to load a scene from a file through use of the Browser object. When a button is selected to provide a new url for a file to load, the Script adds the new world, waits for the load to complete, then adds the loaded Shape into a rendered group. </p>
 <p> Related links: <a href="../../../Siggraph98Course/Loader.java">Loader.java</a> source, <a href="../../../Siggraph98Course/LoaderIndex.html" target="_top">Loader catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Siggraph98Course/Loader.x3d">Loader.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> This example illustrates use of JavaScript to load a scene from a file through use of the Browser object. When a button is selected to provide a new url for a file to load, the Script adds the new world, waits for the load to complete, then adds the loaded Shape into a rendered group. </td>
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
			<td style="text-align:right; vertical-align: text-top;"> <i> Image </i> </td>
			<td> <a href="../../../Siggraph98Course/Loader.png">Loader.png</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="../../../Siggraph98Course/Button.x3d">Button.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> originals/loader.wrl </td>
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
			<td> <a href="http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0469.htm" target="_blank">http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0469.htm</a> </td>
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
			<td> <a href="https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Loader.x3d" target="_blank">https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Loader.x3d</a> </td>
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

public class Loader
{
	/** Default constructor to create this object. */
	public Loader ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
            try { // catch-all
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("Loader.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("This example illustrates use of JavaScript to load a scene from a file through use of the Browser object. When a button is selected to provide a new url for a file to load, the Script adds the new world, waits for the load to complete, then adds the loaded Shape into a rendered group."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("David R. Nadeau"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATOR ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("1 July 1998"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATED ).setContent("2 February 2014"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_IMAGE      ).setContent("Loader.png"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("Button.x3d"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("originals/loader.wrl"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.siggraph.org/s98"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.siggraph.org/s98/conference/courses/18.html"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0469.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://www.web3d.org/x3d/content/examples/X3dResources.html"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Loader.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setInfo(new String[] {"Copyright (c) 1998, David R. Nadeau"}).setTitle("Load VRML using a script"))
    .addChild(new NavigationInfo())
    .addChild(new Viewpoint().setDescription("Entry view"))
    .addChild(new Background().setSkyAngle(new double[] {1.37,1.57,1.77}).setSkyColor(new MFColor(new double[] {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.8,0.2,0.0,0.0,0.0})))
    .addChild(new ExternProtoDeclare("Button").setName("Button").setUrl(new String[] {"Button.x3d#Button","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Button.x3d#Button","Button.wrl#Button","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Button.wrl#Button"})
      .addField(new field().setName("url").setType(field.TYPE_MFSTRING).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
      .addField(new field().setName("textureUrl").setType(field.TYPE_MFSTRING).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
      .addField(new field().setName("url_changed").setType(field.TYPE_MFSTRING).setAccessType(field.ACCESSTYPE_OUTPUTONLY))
      .addField(new field().setName("translation").setType(field.TYPE_SFVEC3F).setAccessType(field.ACCESSTYPE_INITIALIZEONLY)))
    .addChild(new ProtoInstance("Button", "Button1").setContainerField("children")
      .addFieldValue(new fieldValue().setName("url").setValue(new String[] {"One.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/One.x3d"}))
      .addFieldValue(new fieldValue().setName("textureUrl").setValue(new String[] {"one.jpg"}))
      .addFieldValue(new fieldValue().setName("translation").setValue(new SFVec3f(-4.0,2.0,0.0))))
    .addChild(new ProtoInstance("Button", "Button2").setContainerField("children")
      .addFieldValue(new fieldValue().setName("url").setValue(new String[] {"Two.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Two.x3d"}))
      .addFieldValue(new fieldValue().setName("textureUrl").setValue(new String[] {"two.jpg"}))
      .addFieldValue(new fieldValue().setName("translation").setValue(new SFVec3f(-4.0,0.0,0.0))))
    .addChild(new ProtoInstance("Button", "Button3").setContainerField("children")
      .addFieldValue(new fieldValue().setName("url").setValue(new String[] {"Three.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Three.x3d"}))
      .addFieldValue(new fieldValue().setName("textureUrl").setValue(new String[] {"three.jpg"}))
      .addFieldValue(new fieldValue().setName("translation").setValue(new SFVec3f(-4.0,-2.0,0.0))))
    .addChild(new Transform().setTranslation(-4.0,-3.5,0.0)
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material()))
        .setGeometry(new Text("Label")
          .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.75)))))
    .addChild(new Transform("Loaded").setTranslation(1.0,0.0,0.0)
      .addComments(" load result goes here "))
    .addChild(new Script("Loader").setDirectOutput(true).setSourceCode("""
ecmascript:

function loadUrl( str, ts )
{
        lastUrl = str;
        Browser.createVrmlFromURL( str, myself, 'vrmlLoaded' );
        string_changed[0] = 'Loading...';
}
function vrmlLoaded( nd, ts )
{
        node_changed = nd;
        string_changed[0] = lastUrl[0];
}
""")
      .addField(new field().setName("lastUrl").setType(field.TYPE_MFSTRING).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setValue(new String[] {""}))
      .addField(new field().setName("loadUrl").setType(field.TYPE_MFSTRING).setAccessType(field.ACCESSTYPE_INPUTONLY))
      .addField(new field().setName("vrmlLoaded").setType(field.TYPE_MFNODE).setAccessType(field.ACCESSTYPE_INPUTONLY))
      .addField(new field().setName("node_changed").setType(field.TYPE_MFNODE).setAccessType(field.ACCESSTYPE_OUTPUTONLY))
      .addField(new field().setName("string_changed").setType(field.TYPE_MFSTRING).setAccessType(field.ACCESSTYPE_OUTPUTONLY))
      .addField(new field().setName("myself").setType(field.TYPE_SFNODE).setAccessType(field.ACCESSTYPE_INITIALIZEONLY)
        .addChild(new Script().setUSE("Loader"))))
    .addChild(new ROUTE().setFromNode("Button1").setFromField("url_changed").setToNode("Loader").setToField("loadUrl"))
    .addChild(new ROUTE().setFromNode("Button2").setFromField("url_changed").setToNode("Loader").setToField("loadUrl"))
    .addChild(new ROUTE().setFromNode("Button3").setFromField("url_changed").setToNode("Loader").setToField("loadUrl"))
    .addChild(new ROUTE().setFromNode("Loader").setFromField("node_changed").setToNode("Loaded").setToField("set_children"))
    .addChild(new ROUTE().setFromNode("Loader").setFromField("string_changed").setToNode("Label").setToField("set_string")));
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
	 * @return Loader model
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
        X3D thisExampleX3dModel = new Loader().getX3dModel();
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
                System.out.println("WARNING: \"Vrml2Sourcebook.Siggraph98Course.Loader\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
        else if (hasArguments) // if no arguments provided, this method produces usage warning
                thisExampleX3dModel.handleArguments(args);
	
        if (validate)
        {
            //  System.out.println("--- TODO fix duplicated outputs ---"); // omit when duplicated outputs problem is solved/refactored
		String validationResults = thisExampleX3dModel.validationReport();
            //  System.out.println("-----------------------------------"); // omit when duplicated outputs problem is solved/refactored
                System.out.print("Vrml2Sourcebook.Siggraph98Course.Loader self-validation test results: ");
                if (!validationResults.equals("success"))
                    System.out.println();
                System.out.println(validationResults.trim());
        }
    }
}
