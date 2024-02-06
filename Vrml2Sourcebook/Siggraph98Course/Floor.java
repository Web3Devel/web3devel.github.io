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
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.Rendering.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Texturing.*;

// Javadoc metadata annotations follow, see below for X3DJSAIL Java source code.
/**
 * <p> Mesh floor: this file creates a large flat floor. Nothing special except its use... When lighting is computed for a face, it is typically computed only at the four corners of each face. The brightness at the center of the face is then computed by interpolating the brightnesses from the corners. </p>
 <p> Related links: <a href="../../../Siggraph98Course/Floor.java">Floor.java</a> source, <a href="../../../Siggraph98Course/FloorIndex.html" target="_top">Floor catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Siggraph98Course/Floor.x3d">Floor.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Mesh floor: this file creates a large flat floor. Nothing special except its use... When lighting is computed for a face, it is typically computed only at the four corners of each face. The brightness at the center of the face is then computed by interpolating the brightnesses from the corners. </td>
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
			<td> <a href="../../../Siggraph98Course/Monolith.x3d">Monolith.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> originals/floor.wrl </td>
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
			<td> <a href="http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0145.htm" target="_blank">http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0145.htm</a> </td>
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
			<td> <a href="https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Floor.x3d" target="_blank">https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Floor.x3d</a> </td>
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

public class Floor
{
	/** Default constructor to create this object. */
	public Floor ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
            try { // catch-all
  x3dModel = new X3D().setProfile(X3D.PROFILE_INTERCHANGE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("Floor.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Mesh floor: this file creates a large flat floor. Nothing special except its use... When lighting is computed for a face, it is typically computed only at the four corners of each face. The brightness at the center of the face is then computed by interpolating the brightnesses from the corners."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("David R. Nadeau"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATOR ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("1 July 1998"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATED ).setContent("2 February 2014"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("Monolith.x3d"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("originals/floor.wrl"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.siggraph.org/s98"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.siggraph.org/s98/conference/courses/18.html"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0145.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://www.web3d.org/x3d/content/examples/X3dResources.html"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Floor.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addComments(" Where this is important is in floors (and walls). If you create a floor using one large face (or the top of a Box node), then put a point light at the middle of the floor, the floor's corners will all be equi-distant from the light, and thus will have the same, rather dim brightness. When this brightness is interpolated across the face of the floor, you'll get a constant dim brightness... even directly underneath the point light! ")
    .addComments(" To fix this, use a mesh (face set) with lots of smaller faces. Now, each face still has brightness computed for its four corners. However, the small faces near the center of the floor and the point light get higher brightness values computed than those more distant. This will give you a brightening effect under the point light, and a gradual dimming towards the edges of the floor. This is much more realistic! ")
    .addComments(" The disadvantage is the increase in the number of faces in your scene. This can be a performance problem on some VRML browsers. ")
    .addChild(new WorldInfo().setTitle("Floor.x3d"))
    .addChild(new Viewpoint().setDescription("View of floor").setOrientation(1.0,0.0,0.0,-0.197396).setPosition(0.0,2.0,10.0))
    .addChild(new Shape()
      .setAppearance(new Appearance()
        .setTextureTransform(new TextureTransform().setScale(20.0,20.0))
        .setMaterial(new Material().setAmbientIntensity(0.1))
        .setTexture(new ImageTexture().setUrl(new String[] {"stone2.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/stone2.jpg"})))
      .setGeometry(new IndexedFaceSet().setCoordIndex(getIndexedFaceSet_4_26_coordIndex())
        .setCoord(new Coordinate().setPoint(getCoordinate_5_26_point())))));
            }
            catch (Exception ex)
            {       
                System.err.println ("*** Further hints on X3DJSAIL errors and exceptions at");
                System.err.println ("*** https://www.web3d.org/specifications/java/X3DJSAIL.html");
                throw (ex);
            }
	}
	// end of initialize() method

		/** Define subarrays using type int[] */
		private int[] getIndexedFaceSet_4_26_coordIndex_1()
		{
			int[] value = {0,1,12,11,-1,1,2,13,12,-1,2,3,14,13,-1,3,4,15,14,-1,4,5,16,15,-1,5,6,17,16,-1,6,7,18,17,-1,7,8,19,18,-1,8,9,20,19,-1,9,10,21,20,-1,11,12,23,22,-1,12,13,24,23,-1,13,14,25,24,-1,14,15,26,25,-1,15,16,27,26,-1,16,17,28,27,-1,17,18,29,28,-1,18,19,30,29,-1,19,20,31,30,-1,20,21,32,31,-1,22,23,34,33,-1,23,24,35,34,-1,24,25,36,35,-1,25,26,37,36,-1,26,27,38,37,-1,27,28,39,38,-1,28,29,40,39,-1,29,30,41,40,-1,30,31,42,41,-1,31,32,43,42,-1,33,34,45,44,-1,34,35,46,45,-1,35,36,47,46,-1,36,37,48,47,-1,37,38,49,48,-1,38,39,50,49,-1,39,40,51,50,-1,40,41,52,51,-1,41,42,53,52,-1,42,43,54,53,-1,44,45,56,55,-1,45,46,57,56,-1,46,47,58,57,-1,47,48,59,58,-1,48,49,60,59,-1,49,50,61,60,-1,50,51,62,61,-1,51,52,63,62,-1,52,53,64,63,-1,53,54,65,64,-1,55,56,67,66,-1,56,57,68,67,-1,57,58,69,68,-1,58,59,70,69,-1,59,60,71,70,-1,60,61,72,71,-1,61,62,73,72,-1,62,63,74,73,-1,63,64,75,74,-1,64,65,76,75,-1,66,67,78,77,-1,67,68,79,78,-1,68,69,80,79,-1,69,70,81,80,-1,70,71,82,81,-1,71,72,83,82,-1,72,73,84,83,-1,73,74,85,84,-1,74,75,86,85,-1,75,76,87,86,-1,77,78,89,88,-1,78,79,90,89,-1,79,80,91,90,-1,80,81,92,91,-1,81,82,93,92,-1,82,83,94,93,-1,83,84,95,94,-1,84,85,96,95,-1,85,86,97,96,-1,86,87,98,97,-1,88,89,100,99,-1,89,90,101,100,-1,90,91,102,101,-1,91,92,103,102,-1,92,93,104,103,-1,93,94,105,104,-1,94,95,106,105,-1,95,96,107,106,-1,96,97,108,107,-1,97,98,109,108,-1,99,100,111,110,-1,100,101,112,111,-1,101,102,113,112,-1,102,103,114,113,-1,103,104,115,114,-1,104,105,116,115,-1,105,106,117,116,-1,106,107,118,117,-1,107,108,119,118,-1,108,109,120,119,-1};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getCoordinate_5_26_point_1()
		{
			double[] value = {-10.0,0.0,10.0,-8.0,0.0,10.0,-6.0,0.0,10.0,-4.0,0.0,10.0,-2.0,0.0,10.0,0.0,0.0,10.0,2.0,0.0,10.0,4.0,0.0,10.0,6.0,0.0,10.0,8.0,0.0,10.0,10.0,0.0,10.0,-10.0,0.0,8.0,-8.0,0.0,8.0,-6.0,0.0,8.0,-4.0,0.0,8.0,-2.0,0.0,8.0,0.0,0.0,8.0,2.0,0.0,8.0,4.0,0.0,8.0,6.0,0.0,8.0,8.0,0.0,8.0,10.0,0.0,8.0,-10.0,0.0,6.0,-8.0,0.0,6.0,-6.0,0.0,6.0,-4.0,0.0,6.0,-2.0,0.0,6.0,0.0,0.0,6.0,2.0,0.0,6.0,4.0,0.0,6.0,6.0,0.0,6.0,8.0,0.0,6.0,10.0,0.0,6.0,-10.0,0.0,4.0,-8.0,0.0,4.0,-6.0,0.0,4.0,-4.0,0.0,4.0,-2.0,0.0,4.0,0.0,0.0,4.0,2.0,0.0,4.0,4.0,0.0,4.0,6.0,0.0,4.0,8.0,0.0,4.0,10.0,0.0,4.0,-10.0,0.0,2.0,-8.0,0.0,2.0,-6.0,0.0,2.0,-4.0,0.0,2.0,-2.0,0.0,2.0,0.0,0.0,2.0,2.0,0.0,2.0,4.0,0.0,2.0,6.0,0.0,2.0,8.0,0.0,2.0,10.0,0.0,2.0,-10.0,0.0,0.0,-8.0,0.0,0.0,-6.0,0.0,0.0,-4.0,0.0,0.0,-2.0,0.0,0.0,0.0,0.0,0.0,2.0,0.0,0.0,4.0,0.0,0.0,6.0,0.0,0.0,8.0,0.0,0.0,10.0,0.0,0.0,-10.0,0.0,-2.0,-8.0,0.0,-2.0,-6.0,0.0,-2.0,-4.0,0.0,-2.0,-2.0,0.0,-2.0,0.0,0.0,-2.0,2.0,0.0,-2.0,4.0,0.0,-2.0,6.0,0.0,-2.0,8.0,0.0,-2.0,10.0,0.0,-2.0,-10.0,0.0,-4.0,-8.0,0.0,-4.0,-6.0,0.0,-4.0,-4.0,0.0,-4.0,-2.0,0.0,-4.0,0.0,0.0,-4.0,2.0,0.0,-4.0,4.0,0.0,-4.0,6.0,0.0,-4.0,8.0,0.0,-4.0,10.0,0.0,-4.0,-10.0,0.0,-6.0,-8.0,0.0,-6.0,-6.0,0.0,-6.0,-4.0,0.0,-6.0,-2.0,0.0,-6.0,0.0,0.0,-6.0,2.0,0.0,-6.0,4.0,0.0,-6.0,6.0,0.0,-6.0,8.0,0.0,-6.0,10.0,0.0,-6.0,-10.0,0.0,-8.0};
			return value;
		}
		private double[] getCoordinate_5_26_point_2()
		{
			double[] value = {-8.0,0.0,-8.0,-6.0,0.0,-8.0,-4.0,0.0,-8.0,-2.0,0.0,-8.0,0.0,0.0,-8.0,2.0,0.0,-8.0,4.0,0.0,-8.0,6.0,0.0,-8.0,8.0,0.0,-8.0,10.0,0.0,-8.0,-10.0,0.0,-10.0,-8.0,0.0,-10.0,-6.0,0.0,-10.0,-4.0,0.0,-10.0,-2.0,0.0,-10.0,0.0,0.0,-10.0,2.0,0.0,-10.0,4.0,0.0,-10.0,6.0,0.0,-10.0,8.0,0.0,-10.0,10.0,0.0,-10.0};
			return value;
		}

		/** Large attribute array: IndexedFaceSet coordIndex field, scene-graph level=4, element #26, 500 total numbers.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFInt32 getIndexedFaceSet_4_26_coordIndex()
		{
			MFInt32 IndexedFaceSet_4_26_coordIndex = new MFInt32()/*2.finalize*/
				.append(new MFInt32(getIndexedFaceSet_4_26_coordIndex_1()));
			return IndexedFaceSet_4_26_coordIndex;
		}
		/** Large attribute array: Coordinate point field, scene-graph level=5, element #26, 363 total numbers made up of 121 3-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFVec3f getCoordinate_5_26_point()
		{
			MFVec3f Coordinate_5_26_point = new MFVec3f()/*2.finalize*/
				.append(new MFVec3f(getCoordinate_5_26_point_1()))
				.append(new MFVec3f(getCoordinate_5_26_point_2()));
			return Coordinate_5_26_point;
		}

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return Floor model
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
        X3D thisExampleX3dModel = new Floor().getX3dModel();
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
                System.out.println("WARNING: \"Vrml2Sourcebook.Siggraph98Course.Floor\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
        else if (hasArguments) // if no arguments provided, this method produces usage warning
                thisExampleX3dModel.handleArguments(args);
	
        if (validate)
        {
            //  System.out.println("--- TODO fix duplicated outputs ---"); // omit when duplicated outputs problem is solved/refactored
		String validationResults = thisExampleX3dModel.validationReport();
            //  System.out.println("-----------------------------------"); // omit when duplicated outputs problem is solved/refactored
                System.out.print("Vrml2Sourcebook.Siggraph98Course.Floor self-validation test results: ");
                if (!validationResults.equals("success"))
                    System.out.println();
                System.out.println(validationResults.trim());
        }
    }
}
