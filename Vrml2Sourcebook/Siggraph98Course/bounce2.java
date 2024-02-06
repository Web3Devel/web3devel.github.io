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
import org.web3d.x3d.jsail.Geometry3D.*;
import org.web3d.x3d.jsail.Grouping.*;
import org.web3d.x3d.jsail.Lighting.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.Rendering.*;
import org.web3d.x3d.jsail.Scripting.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Texturing.*;
import org.web3d.x3d.jsail.Time.*;

// Javadoc metadata annotations follow, see below for X3DJSAIL Java source code.
/**
 * <p> Bouncing beachball (Java version): this world illustrates the use of a Script node to create a computed animation path. In particular, the Script node uses a Java program script to compute translation values for a vertically bouncing beach ball. </p>
 <p> Related links: <a href="../../../Siggraph98Course/Bounce2.java">Bounce2.java</a> source, <a href="../../../Siggraph98Course/Bounce2Index.html" target="_top">Bounce2 catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Siggraph98Course/Bounce2.x3d">Bounce2.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Bouncing beachball (Java version): this world illustrates the use of a Script node to create a computed animation path. In particular, the Script node uses a Java program script to compute translation values for a vertically bouncing beach ball. </td>
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
			<td> 3 November 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> originals/bounce2.wrl </td>
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
			<td> <a href="http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0457.htm" target="_blank">http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0457.htm</a> </td>
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
			<td> <a href="https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Bounce2.x3d" target="_blank">https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Bounce2.x3d</a> </td>
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

public class Bounce2
{
	/** Default constructor to create this object. */
	public Bounce2 ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
            try { // catch-all
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("Bounce2.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Bouncing beachball (Java version): this world illustrates the use of a Script node to create a computed animation path. In particular, the Script node uses a Java program script to compute translation values for a vertically bouncing beach ball."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("David R. Nadeau"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATOR ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("1 July 1998"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATED ).setContent("2 February 2014"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("3 November 2019"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("originals/bounce2.wrl"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.siggraph.org/s98"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.siggraph.org/s98/conference/courses/18.html"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0457.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://www.web3d.org/x3d/content/examples/X3dResources.html"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Bounce2.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addComments(" http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/bounce2.htm ")
    .addComments(" The bounce path is based upon the projectile motion equation of physics, constrained to create a cyclic bouncing path with a user-selected maximum bounce height. Also, there is no friction, drag, or damping. For an explanation of the script, see 'bounce1.wrl'. ")
    .addComments(" Things to experiment with ")
    .addComments(" Encapsulate the ball, script, timer, and sensors within a PROTO for a new node named \"BouncingBall\". Then use that new BouncingBall node multiple times to create multiple bouncing balls. Your PROTO interface might look like this: ")
    .addComments(" PROTO BouncingBall [ field SFFloat bounceHeight 2.0 field SFTime cycleInterval 2.0 ] { . . . } ")
    .addComments(" See 'bounce3.wrl', which implements such a PROTO. ")
    .addComments(" - Add a shadow under the bouncing ball. To do this, add a circular, semi-transparent, black shape that doesn't bounce. To make the shadow more realistic, scale the shadow in the X and Z directions, shrinking it as the ball goes up, and increasing it as the ball comes down. You'll need to add another eventOut for the Script node and send an XYZ scaling factor triple out that eventOut. Try the following values for the XYZ scale values: ")
    .addComments(" xzscale = 1.0 - 0.5 * y / bounceHeight; ")
    .addComments(" shadowScale_changed[0] = xzscale; ")
    .addComments(" shadowScale_changed[1] = 1.0; ")
    .addComments(" shadowScale_changed[2] = xzscale; ")
    .addComments(" See 'bounce4.wrl', which implements shadows using the above ")
    .addComments(" - Add a sound to the PROTO so that each time the ball touches the ground, it makes a 'boing' sound. ")
    .addComments(" - When the ball hits the ground, scale the ball slightly so that it appears to squish. ")
    .addChild(new WorldInfo().setInfo(new String[] {"Copyright (c) 1997, David R. Nadeau"}).setTitle("Bouncing beachball (Java)"))
    .addChild(new Viewpoint().setDescription("Bouncing beachball, Java version").setOrientation(1.0,0.0,0.0,0.1).setPosition(0.0,0.6,8.0))
    .addChild(new NavigationInfo().setHeadlight(false).setSpeed(2.0))
    .addChild(new DirectionalLight().setAmbientIntensity(0.5).setDirection(0.0,-1.0,-0.5))
    .addChild(new Background().setSkyAngle(new double[] {1.371,1.571}).setSkyColor(new MFColor(new double[] {0.0,0.0,1.0,0.0,0.5,1.0,0.7,0.7,1.0})))
    .addChild(new Shape()
      .setAppearance(new Appearance()
        .setTextureTransform(new TextureTransform().setScale(10.0,10.0))
        .setMaterial(new Material())
        .setTexture(new ImageTexture().setUrl(new String[] {"sand.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/sand.jpg"})))
      .setGeometry(new IndexedFaceSet().setSolid(false).setCoordIndex(new int[] {0,1,2,3})
        .setCoord(new Coordinate().setPoint(new MFVec3f(new double[] {-50.0,-1.0,50.0,50.0,-1.0,50.0,50.0,-1.0,-50.0,-50.0,-1.0,-50.0})))))
    .addChild(new Transform().setTranslation(-3.0,-1.0,-10.0)
      .addChild(new Group("Palm")
        .addChild(new Billboard()
          .addChild(new Shape()
            .setAppearance(new Appearance()
              .setTexture(new ImageTexture().setUrl(new String[] {"palm.png","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/palm.png"})))
            .setGeometry(new IndexedFaceSet().setSolid(false).setCoordIndex(new int[] {0,1,2,3}).setTexCoordIndex(new int[] {0,1,2,3})
              .setTexCoord(new TextureCoordinate().setPoint(new MFVec2f(new double[] {0.0,0.0,1.0,0.0,1.0,1.0,0.0,1.0})))
              .setCoord(new Coordinate().setPoint(new MFVec3f(new double[] {-2.5,0.0,0.0,2.5,0.0,0.0,2.5,11.25,0.0,-2.5,11.25,0.0}))))))
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.0,0.0,0.0).setTransparency(0.5))
            .setTexture(new ImageTexture().setUrl(new String[] {"palmsh.png","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/palmsh.png"})))
          .setGeometry(new IndexedFaceSet().setSolid(false).setCoordIndex(new int[] {0,1,2,3}).setTexCoordIndex(new int[] {0,1,2,3})
            .setTexCoord(new TextureCoordinate().setPoint(new MFVec2f(new double[] {0.0,0.0,1.0,0.0,1.0,1.0,0.0,1.0})))
            .setCoord(new Coordinate().setPoint(new MFVec3f(new double[] {-2.5,0.05,2.5,2.5,0.05,2.5,2.5,0.05,-2.5,-2.5,0.05,-2.5})))))))
    .addChild(new Transform().setScale(0.6,0.6,0.6).setTranslation(-5.0,-1.0,-6.0)
      .addChild(new Group().setUSE("Palm")))
    .addChild(new Transform().setTranslation(5.0,-1.0,-9.0)
      .addChild(new Group().setUSE("Palm")))
    .addChild(new Transform().setTranslation(10.0,-1.0,-15.0)
      .addChild(new Group().setUSE("Palm")))
    .addChild(new Transform("Ball")
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setTextureTransform(new TextureTransform().setScale(2.0,1.0))
          .setMaterial(new Material().setAmbientIntensity(0.5).setDiffuseColor(1.0,1.0,1.0).setShininess(0.4).setSpecularColor(0.7,0.7,0.7))
          .setTexture(new ImageTexture().setUrl(new String[] {"beach.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/beach.jpg"})))
        .setGeometry(new Sphere())))
    .addChild(new TimeSensor("Clock").setCycleInterval(2.0).setLoop(true).setStartTime(1.0))
    .addChild(new Script("Bouncer").setUrl(new String[] {"Bounce2Script.class","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Bounce2Script.class"})
      .addField(new field().setName("value_changed").setType(field.TYPE_SFVEC3F).setAccessType(field.ACCESSTYPE_OUTPUTONLY))
      .addField(new field().setName("bounceHeight").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setValue(3.0))
      .addField(new field().setName("set_fraction").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INPUTONLY)))
    .addChild(new ROUTE().setFromNode("Clock").setFromField("fraction_changed").setToNode("Bouncer").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Bouncer").setFromField("value_changed").setToNode("Ball").setToField("set_translation")));
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
	 * @return Bounce2 model
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
        X3D thisExampleX3dModel = new Bounce2().getX3dModel();
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
                System.out.println("WARNING: \"Vrml2Sourcebook.Siggraph98Course.Bounce2\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
        else if (hasArguments) // if no arguments provided, this method produces usage warning
                thisExampleX3dModel.handleArguments(args);
	
        if (validate)
        {
            //  System.out.println("--- TODO fix duplicated outputs ---"); // omit when duplicated outputs problem is solved/refactored
		String validationResults = thisExampleX3dModel.validationReport();
            //  System.out.println("-----------------------------------"); // omit when duplicated outputs problem is solved/refactored
                System.out.print("Vrml2Sourcebook.Siggraph98Course.Bounce2 self-validation test results: ");
                if (!validationResults.equals("success"))
                    System.out.println();
                System.out.println(validationResults.trim());
        }
    }
}
