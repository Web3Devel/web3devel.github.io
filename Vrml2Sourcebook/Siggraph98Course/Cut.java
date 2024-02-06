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
import org.web3d.x3d.jsail.Networking.*;
import org.web3d.x3d.jsail.PointingDeviceSensor.*;
import org.web3d.x3d.jsail.Rendering.*;
import org.web3d.x3d.jsail.Scripting.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Text.*;
import org.web3d.x3d.jsail.Texturing.*;

// Javadoc metadata annotations follow, see below for X3DJSAIL Java source code.
/**
 * <p> Cutting plane parts: this file contains two prototype declarations used in creating a cutting plane. The example scene TexturePlane uses these for external prototype instances and creates a plane with one of a set of textures mapped to it. The texture choice is controlled by a fraction eventIn. SlidingPlane creates a texture plane that slides back and forth along the X axis, changing the texture based upon the X position. </p>
 <p> Related links: <a href="../../../Siggraph98Course/Cut.java">Cut.java</a> source, <a href="../../../Siggraph98Course/CutIndex.html" target="_top">Cut catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Siggraph98Course/Cut.x3d">Cut.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Cutting plane parts: this file contains two prototype declarations used in creating a cutting plane. The example scene TexturePlane uses these for external prototype instances and creates a plane with one of a set of textures mapped to it. The texture choice is controlled by a fraction eventIn. SlidingPlane creates a texture plane that slides back and forth along the X axis, changing the texture based upon the X position. </td>
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
			<td> 16 December 2023 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="../../../Siggraph98Course/CutPlane.x3d">CutPlane.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="../../../Siggraph98Course/TexturePlane.x3d">TexturePlane.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> originals/cut.wrl </td>
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
			<td> <a href="http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0497.htm" target="_blank">http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0497.htm</a> </td>
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
			<td> <a href="https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Cut.x3d" target="_blank">https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Cut.x3d</a> </td>
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

public class Cut
{
	/** Default constructor to create this object. */
	public Cut ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
            try { // catch-all
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("Cut.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Cutting plane parts: this file contains two prototype declarations used in creating a cutting plane. The example scene TexturePlane uses these for external prototype instances and creates a plane with one of a set of textures mapped to it. The texture choice is controlled by a fraction eventIn. SlidingPlane creates a texture plane that slides back and forth along the X axis, changing the texture based upon the X position."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("David R. Nadeau"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATOR ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("1 July 1998"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATED ).setContent("2 February 2014"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("16 December 2023"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("CutPlane.x3d"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("TexturePlane.x3d"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("originals/cut.wrl"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.siggraph.org/s98"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.siggraph.org/s98/conference/courses/18.html"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0497.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://www.web3d.org/x3d/content/examples/X3dResources.html"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Cut.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setInfo(new String[] {"Copyright (c) 1997, David R. Nadeau"}).setTitle("Cutting Plane parts"))
    .addChild(new ProtoDeclare("TexturePlane").setName("TexturePlane")
      .setProtoInterface(new ProtoInterface()
        .addField(new field().setName("textures").setType(field.TYPE_MFNODE).setAccessType(field.ACCESSTYPE_INITIALIZEONLY)
          .addComments(" initialized with ImageTexture nodes upon use "))
        .addField(new field().setName("set_fraction").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INPUTONLY)))
      .setProtoBody(new ProtoBody()
        .addChild(new Group()
          .addChild(new Shape()
            .setAppearance(new Appearance("App"))
            .setGeometry(new IndexedFaceSet().setSolid(false).setCoordIndex(new int[] {0,1,2,3}).setTexCoordIndex(new int[] {0,1,2,3})
              .setTexCoord(new TextureCoordinate().setPoint(new MFVec2f(new double[] {0.0,0.0,1.0,0.0,1.0,1.0,0.0,1.0})))
              .setCoord(new Coordinate().setPoint(new MFVec3f(new double[] {-1.0,-1.0,0.0,1.0,-1.0,0.0,1.0,1.0,0.0,-1.0,1.0,0.0})))))
          .addChild(new Shape()
            .setAppearance(new Appearance())
            .setGeometry(new IndexedLineSet().setCoordIndex(new int[] {0,1,2,3,0})
              .setCoord(new Coordinate().setPoint(new MFVec3f(new double[] {-1.0,-1.0,0.0,1.0,-1.0,0.0,1.0,1.0,0.0,-1.0,1.0,0.0}))))))
        .addComments(" ProtoBody child following first child will not be rendered, since the first child determines node type of this prototype. ")
        .addChild(new Script("Selector").setDirectOutput(true).setSourceCode("""
ecmascript:
    function initialize( ) {
        texture_changed = textures[0];
        Browser.println ('[Cut Selector] initialize(): textures.length=' + textures.length); // debug
    }
    function set_fraction( f, tm ) {
        i = Math.floor(f * 10);
        if ( i == 10 ) { i = 9; }
        Browser.println ('[Cut Selector] set_fraction(): i=' + i); // debug
        texture_changed = textures[i];
    }
""")
          .addField(new field().setName("textures").setType(field.TYPE_MFNODE).setAccessType(field.ACCESSTYPE_INITIALIZEONLY))
          .addField(new field().setName("texture_changed").setType(field.TYPE_SFNODE).setAccessType(field.ACCESSTYPE_OUTPUTONLY))
          .addField(new field().setName("set_fraction").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INPUTONLY))
          .setIS(new IS()
            .addConnect(new connect().setNodeField("textures").setProtoField("textures"))
            .addConnect(new connect().setNodeField("set_fraction").setProtoField("set_fraction"))))
        .addChild(new ROUTE().setFromNode("Selector").setFromField("texture_changed").setToNode("App").setToField("set_texture"))))
    .addChild(new ProtoDeclare("SlidingPlane").setName("SlidingPlane")
      .setProtoInterface(new ProtoInterface()
        .addField(new field().setName("textures").setType(field.TYPE_MFNODE).setAccessType(field.ACCESSTYPE_INITIALIZEONLY)
          .addComments(" initialized with ImageTexture nodes upon use "))
        .addField(new field().setName("minMaxX").setType(field.TYPE_SFVEC2F).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setValue(new SFVec2f(0.0,1.0)))
        .addField(new field().setName("initialX").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setValue(0.0)))
      .setProtoBody(new ProtoBody()
        .addChild(new Transform().setRotation(0.0,1.0,0.0,1.571)
          .addChild(new PlaneSensor("Slider").setDescription("drag to see cross-section slices"))
          .addChild(new Transform("PlanePosition").setRotation(0.0,1.0,0.0,-1.571)
            .addChild(new ProtoInstance("TexturePlane", "Plane").setContainerField("children")
              .setIS(new IS()
                .addConnect(new connect().setNodeField("textures").setProtoField("textures"))))
            .addChild(new Transform().setRotation(0.0,1.0,0.0,1.571).setTranslation(1.05,-1.2,0.0)
              .addChild(new Shape()
                .setAppearance(new Appearance())
                .setGeometry(new Text("Label").setString(new String[] {""})
                  .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.3).setCssStyle("BOLD")))))))
        .addChild(new Script("Translator").setSourceCode("""
ecmascript:
        function translate( x ) {
        // compute the fraction using the given X position
            f = (x-minMaxX[0]) / (minMaxX[1] - minMaxX[0]);
        // send a fraction event
            fraction_changed = f;
        // send a new label string with 1 digit after decimal
            label_changed[0] = Math.floor(f*10.0)/10.0;
        }

        function initialize( ) {
        // set the plane sensor bounds
            minPosition_changed[0] = minMaxX[0];
            minPosition_changed[1] = 0.0;
            maxPosition_changed[0] = minMaxX[1];
            maxPosition_changed[1] = 0.0;
        // set the plane sensor initial position
            offset_changed[0] = initialX;
            offset_changed[1] = 0.0;
            offset_changed[2] = 0.0;
        // compute the initial values
            translate( initialX );
        }

        function set_translation( t, tm ) {
        // compute the new values
            translate( t[0] );
        }
""")
          .addField(new field().setName("set_translation").setType(field.TYPE_SFVEC3F).setAccessType(field.ACCESSTYPE_INPUTONLY))
          .addField(new field().setName("minMaxX").setType(field.TYPE_SFVEC2F).setAccessType(field.ACCESSTYPE_INITIALIZEONLY))
          .addField(new field().setName("minPosition_changed").setType(field.TYPE_SFVEC2F).setAccessType(field.ACCESSTYPE_OUTPUTONLY))
          .addField(new field().setName("fraction_changed").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_OUTPUTONLY))
          .addField(new field().setName("initialX").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INITIALIZEONLY))
          .addField(new field().setName("offset_changed").setType(field.TYPE_SFVEC3F).setAccessType(field.ACCESSTYPE_OUTPUTONLY))
          .addField(new field().setName("maxPosition_changed").setType(field.TYPE_SFVEC2F).setAccessType(field.ACCESSTYPE_OUTPUTONLY))
          .addField(new field().setName("label_changed").setType(field.TYPE_MFSTRING).setAccessType(field.ACCESSTYPE_OUTPUTONLY))
          .setIS(new IS()
            .addConnect(new connect().setNodeField("minMaxX").setProtoField("minMaxX"))
            .addConnect(new connect().setNodeField("initialX").setProtoField("initialX"))))
        .addChild(new ROUTE().setFromNode("Slider").setFromField("translation_changed").setToNode("PlanePosition").setToField("set_translation"))
        .addChild(new ROUTE().setFromNode("Slider").setFromField("translation_changed").setToNode("Translator").setToField("set_translation"))
        .addChild(new ROUTE().setFromNode("Translator").setFromField("fraction_changed").setToNode("Plane").setToField("set_fraction"))
        .addChild(new ROUTE().setFromNode("Translator").setFromField("label_changed").setToNode("Label").setToField("set_string"))
        .addChild(new ROUTE().setFromNode("Translator").setFromField("minPosition_changed").setToNode("Slider").setToField("set_minPosition"))
        .addChild(new ROUTE().setFromNode("Translator").setFromField("maxPosition_changed").setToNode("Slider").setToField("set_maxPosition"))
        .addChild(new ROUTE().setFromNode("Translator").setFromField("offset_changed").setToNode("Slider").setToField("set_offset"))
        .addChild(new ROUTE().setFromNode("Translator").setFromField("offset_changed").setToNode("PlanePosition").setToField("set_translation"))))
    .addComments(" Display scene instructions for viewing an example scene with a corresponding prototype instance ")
    .addChild(new Background().setSkyColor(new MFColor(new double[] {0.0,0.333333,0.66667})))
    .addChild(new Transform().setTranslation(0.0,2.5,0.0)
      .addChild(new Anchor().setDescription("select text to view parent scene").setUrl(new String[] {"CutPlane.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/CutPlane.x3d","CutPlane.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/CutPlane.wrl"})
        .addChild(new Shape()
          .setGeometry(new Text().setString(new String[] {"The Cut.x3d scene holds","prototype declarations","Select this text to view example usage","in CutPlane.x3d scene"})
            .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setCssStyle("BOLD")))
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,0.9,0.4))))
        .addComments(" Invisible box behind text makes selection easier ")
        .addChild(new Shape()
          .setGeometry(new Box().setSize(12.0,5.0,0.1))
          .setAppearance(new Appearance()
            .setMaterial(new Material().setTransparency(1))))))
    .addChild(new Transform().setTranslation(0.0,-2.5,0.0)
      .addChild(new Anchor().setDescription("select text to view parent scene").setUrl(new String[] {"TexturePlane.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/TexturePlane.x3d","TexturePlane.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/TexturePlane.wrl"})
        .addChild(new Shape()
          .setGeometry(new Text().setString(new String[] {"or select this text to view example usage","in TexturePlane.x3d scene"})
            .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setCssStyle("BOLD")))
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,0.9,0.4))))
        .addComments(" Invisible box behind text makes selection easier ")
        .addChild(new Shape()
          .setGeometry(new Box().setSize(12.0,5.0,0.1))
          .setAppearance(new Appearance()
            .setMaterial(new Material().setTransparency(1)))))));
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
	 * @return Cut model
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
        X3D thisExampleX3dModel = new Cut().getX3dModel();
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
                System.out.println("WARNING: \"Vrml2Sourcebook.Siggraph98Course.Cut\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
        else if (hasArguments) // if no arguments provided, this method produces usage warning
                thisExampleX3dModel.handleArguments(args);
	
        if (validate)
        {
            //  System.out.println("--- TODO fix duplicated outputs ---"); // omit when duplicated outputs problem is solved/refactored
		String validationResults = thisExampleX3dModel.validationReport();
            //  System.out.println("-----------------------------------"); // omit when duplicated outputs problem is solved/refactored
                System.out.print("Vrml2Sourcebook.Siggraph98Course.Cut self-validation test results: ");
                if (!validationResults.equals("success"))
                    System.out.println();
                System.out.println(validationResults.trim());
        }
    }
}
