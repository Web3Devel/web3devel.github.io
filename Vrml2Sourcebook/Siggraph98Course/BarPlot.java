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
import org.web3d.x3d.jsail.Text.*;

// Javadoc metadata annotations follow, see below for X3DJSAIL Java source code.
/**
 * <p> Demonstrate plotting values with 3D emphasis. </p>
 <p> Related links: <a href="../../../Siggraph98Course/BarPlot.java">BarPlot.java</a> source, <a href="../../../Siggraph98Course/BarPlotIndex.html" target="_top">BarPlot catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Siggraph98Course/BarPlot.x3d">BarPlot.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Demonstrate plotting values with 3D emphasis. </td>
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
			<td> 3 September 2023 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> Image </i> </td>
			<td> <a href="../../../Siggraph98Course/BarPlot.png">BarPlot.png</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> originals/barplot.wrl </td>
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
			<td> <a href="http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0113.htm" target="_blank">http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0113.htm</a> </td>
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
			<td> <a href="https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/BarPlot.x3d" target="_blank">https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/BarPlot.x3d</a> </td>
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

public class BarPlot
{
	/** Default constructor to create this object. */
	public BarPlot ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
            try { // catch-all
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("BarPlot.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Demonstrate plotting values with 3D emphasis."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("John L. Moreland"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATOR ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("1 July 1998"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATED ).setContent("2 February 2014"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("3 September 2023"))
    .addMeta(new meta().setName(meta.NAME_IMAGE      ).setContent("BarPlot.png"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("originals/barplot.wrl"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.siggraph.org/s98"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.siggraph.org/s98/conference/courses/18.html"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0113.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://www.web3d.org/x3d/content/examples/X3dResources.html"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/BarPlot.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setInfo(new String[] {"copyright (c) 1997, John L. Moreland"}).setTitle("3D Bar Plot"))
    .addChild(new Viewpoint().setDescription("Entry view").setPosition(0.0,0.0,20.0))
    .addChild(new NavigationInfo())
    .addChild(new Transform().setTranslation(-14.5,-2.5,0.0)
      .addChild(new Transform()
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.0,0.0,1.0)))
          .setGeometry(new Box().setSize(1.0,0.00001,1.0))))
      .addChild(new Transform().setTranslation(0.0,0.47619,0.0)
        .addChild(new Billboard().setAxisOfRotation(0.0,0.0,0.0)
          .addChild(new Shape()
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(0.8,0.8,0.0)))
            .setGeometry(new Text().setString(new String[] {"0.0"})
              .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.454545))))))
      .addChild(new Transform().setTranslation(1.0,0.519779,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.207912,0.0,0.792089)))
          .setGeometry(new Box().setSize(1.0,1.039558,1.0))))
      .addChild(new Transform().setTranslation(1.0,1.515748,0.0)
        .addChild(new Billboard().setAxisOfRotation(0.0,0.0,0.0)
          .addChild(new Shape()
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(0.8,0.8,0.0)))
            .setGeometry(new Text().setString(new String[] {"1.0"})
              .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.454545))))))
      .addChild(new Transform().setTranslation(2.0,1.016841,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.406736,0.0,0.593264)))
          .setGeometry(new Box().setSize(1.0,2.033682,1.0))))
      .addChild(new Transform().setTranslation(2.0,2.509872,0.0)
        .addChild(new Billboard().setAxisOfRotation(0.0,0.0,0.0)
          .addChild(new Shape()
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(0.8,0.8,0.0)))
            .setGeometry(new Text().setString(new String[] {"2.0"})
              .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.454545))))))
      .addChild(new Transform().setTranslation(3.0,1.469462,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.587785,0.0,0.412215)))
          .setGeometry(new Box().setSize(1.0,2.938924,1.0))))
      .addChild(new Transform().setTranslation(3.0,3.415115,0.0)
        .addChild(new Billboard().setAxisOfRotation(0.0,0.0,0.0)
          .addChild(new Shape()
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(0.8,0.8,0.0)))
            .setGeometry(new Text().setString(new String[] {"2.9"})
              .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.454545))))))
      .addChild(new Transform().setTranslation(4.0,1.857861,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.743144,0.0,0.256856)))
          .setGeometry(new Box().setSize(1.0,3.715722,1.0))))
      .addChild(new Transform().setTranslation(4.0,4.191912,0.0)
        .addChild(new Billboard().setAxisOfRotation(0.0,0.0,0.0)
          .addChild(new Shape()
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(0.8,0.8,0.0)))
            .setGeometry(new Text().setString(new String[] {"3.7"})
              .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.454545))))))
      .addChild(new Transform().setTranslation(5.0,2.165062,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.866025,0.0,0.133975)))
          .setGeometry(new Box().setSize(1.0,4.330125,1.0))))
      .addChild(new Transform().setTranslation(5.0,4.806315,0.0)
        .addChild(new Billboard().setAxisOfRotation(0.0,0.0,0.0)
          .addChild(new Shape()
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(0.8,0.8,0.0)))
            .setGeometry(new Text().setString(new String[] {"4.3"})
              .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.454545))))))
      .addChild(new Transform().setTranslation(6.0,2.37764,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.951056,0.0,0.048944)))
          .setGeometry(new Box().setSize(1.0,4.755281,1.0))))
      .addChild(new Transform().setTranslation(6.0,5.231471,0.0)
        .addChild(new Billboard().setAxisOfRotation(0.0,0.0,0.0)
          .addChild(new Shape()
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(0.8,0.8,0.0)))
            .setGeometry(new Text().setString(new String[] {"4.8"})
              .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.454545))))))
      .addChild(new Transform().setTranslation(7.0,2.486305,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.994522,0.0,0.005478)))
          .setGeometry(new Box().setSize(1.0,4.972609,1.0))))
      .addChild(new Transform().setTranslation(7.0,5.4488,0.0)
        .addChild(new Billboard().setAxisOfRotation(0.0,0.0,0.0)
          .addChild(new Shape()
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(0.8,0.8,0.0)))
            .setGeometry(new Text().setString(new String[] {"5.0"})
              .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.454545))))))
      .addChild(new Transform().setTranslation(8.0,2.486305,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.994522,0.0,0.005478)))
          .setGeometry(new Box().setSize(1.0,4.97261,1.0))))
      .addChild(new Transform().setTranslation(8.0,5.4488,0.0)
        .addChild(new Billboard().setAxisOfRotation(0.0,0.0,0.0)
          .addChild(new Shape()
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(0.8,0.8,0.0)))
            .setGeometry(new Text().setString(new String[] {"5.0"})
              .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.454545))))))
      .addChild(new Transform().setTranslation(9.0,2.377643,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.951057,0.0,0.048943)))
          .setGeometry(new Box().setSize(1.0,4.755285,1.0))))
      .addChild(new Transform().setTranslation(9.0,5.231476,0.0)
        .addChild(new Billboard().setAxisOfRotation(0.0,0.0,0.0)
          .addChild(new Shape()
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(0.8,0.8,0.0)))
            .setGeometry(new Text().setString(new String[] {"4.8"})
              .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.454545))))))
      .addChild(new Transform().setTranslation(10.0,2.165066,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.866026,0.0,0.133974)))
          .setGeometry(new Box().setSize(1.0,4.330132,1.0))))
      .addChild(new Transform().setTranslation(10.0,4.806322,0.0)
        .addChild(new Billboard().setAxisOfRotation(0.0,0.0,0.0)
          .addChild(new Shape()
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(0.8,0.8,0.0)))
            .setGeometry(new Text().setString(new String[] {"4.3"})
              .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.454545))))))
      .addChild(new Transform().setTranslation(11.0,1.857865,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.743146,0.0,0.256854)))
          .setGeometry(new Box().setSize(1.0,3.71573,1.0))))
      .addChild(new Transform().setTranslation(11.0,4.191921,0.0)
        .addChild(new Billboard().setAxisOfRotation(0.0,0.0,0.0)
          .addChild(new Shape()
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(0.8,0.8,0.0)))
            .setGeometry(new Text().setString(new String[] {"3.7"})
              .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.454545))))))
      .addChild(new Transform().setTranslation(12.0,1.469467,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.587787,0.0,0.412213)))
          .setGeometry(new Box().setSize(1.0,2.938935,1.0))))
      .addChild(new Transform().setTranslation(12.0,3.415125,0.0)
        .addChild(new Billboard().setAxisOfRotation(0.0,0.0,0.0)
          .addChild(new Shape()
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(0.8,0.8,0.0)))
            .setGeometry(new Text().setString(new String[] {"2.9"})
              .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.454545))))))
      .addChild(new Transform().setTranslation(13.0,1.016847,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.406739,0.0,0.593261)))
          .setGeometry(new Box().setSize(1.0,2.033694,1.0))))
      .addChild(new Transform().setTranslation(13.0,2.509884,0.0)
        .addChild(new Billboard().setAxisOfRotation(0.0,0.0,0.0)
          .addChild(new Shape()
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(0.8,0.8,0.0)))
            .setGeometry(new Text().setString(new String[] {"2.0"})
              .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.454545))))))
      .addChild(new Transform().setTranslation(14.0,0.519785,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.207914,0.0,0.792086)))
          .setGeometry(new Box().setSize(1.0,1.03957,1.0))))
      .addChild(new Transform().setTranslation(14.0,1.51576,0.0)
        .addChild(new Billboard().setAxisOfRotation(0.0,0.0,0.0)
          .addChild(new Shape()
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(0.8,0.8,0.0)))
            .setGeometry(new Text().setString(new String[] {"1.0"})
              .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.454545))))))
      .addChild(new Transform().setTranslation(15.0,6.0E-6,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .addComments(" diffuseColor value originally 3.0E-6 0.0 0.999997, simplified to avoid schema/regex validation error [0..1] ")
            .setMaterial(new Material().setDiffuseColor(0.0,0.0,1.0)))
          .setGeometry(new Box().setSize(1.0,1.3E-5,1.0))))
      .addChild(new Transform().setTranslation(15.0,0.476203,0.0)
        .addChild(new Billboard().setAxisOfRotation(0.0,0.0,0.0)
          .addChild(new Shape()
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(0.8,0.8,0.0)))
            .setGeometry(new Text().setString(new String[] {"0.0"})
              .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.454545))))))
      .addChild(new Transform().setTranslation(16.0,-0.519772,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.207909,0.0,0.792091)))
          .setGeometry(new Box().setSize(1.0,1.039545,1.0))))
      .addChild(new Transform().setTranslation(16.0,-1.515735,0.0)
        .addChild(new Billboard().setAxisOfRotation(0.0,0.0,0.0)
          .addChild(new Shape()
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(0.8,0.8,0.0)))
            .setGeometry(new Text().setString(new String[] {"-1.0"})
              .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.454545))))))
      .addChild(new Transform().setTranslation(17.0,-1.016835,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.406734,0.0,0.593266)))
          .setGeometry(new Box().setSize(1.0,2.033669,1.0))))
      .addChild(new Transform().setTranslation(17.0,-2.50986,0.0)
        .addChild(new Billboard().setAxisOfRotation(0.0,0.0,0.0)
          .addChild(new Shape()
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(0.8,0.8,0.0)))
            .setGeometry(new Text().setString(new String[] {"-2.0"})
              .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.454545))))))
      .addChild(new Transform().setTranslation(18.0,-1.469457,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.587783,0.0,0.412217)))
          .setGeometry(new Box().setSize(1.0,2.938913,1.0))))
      .addChild(new Transform().setTranslation(18.0,-3.415104,0.0)
        .addChild(new Billboard().setAxisOfRotation(0.0,0.0,0.0)
          .addChild(new Shape()
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(0.8,0.8,0.0)))
            .setGeometry(new Text().setString(new String[] {"-2.9"})
              .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.454545))))))
      .addChild(new Transform().setTranslation(19.0,-1.857857,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.743143,0.0,0.256857)))
          .setGeometry(new Box().setSize(1.0,3.715713,1.0))))
      .addChild(new Transform().setTranslation(19.0,-4.191904,0.0)
        .addChild(new Billboard().setAxisOfRotation(0.0,0.0,0.0)
          .addChild(new Shape()
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(0.8,0.8,0.0)))
            .setGeometry(new Text().setString(new String[] {"-3.7"})
              .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.454545))))))
      .addChild(new Transform().setTranslation(20.0,-2.165059,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.866024,0.0,0.133976)))
          .setGeometry(new Box().setSize(1.0,4.330118,1.0))))
      .addChild(new Transform().setTranslation(20.0,-4.806308,0.0)
        .addChild(new Billboard().setAxisOfRotation(0.0,0.0,0.0)
          .addChild(new Shape()
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(0.8,0.8,0.0)))
            .setGeometry(new Text().setString(new String[] {"-4.3"})
              .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.454545))))))
      .addChild(new Transform().setTranslation(21.0,-2.377639,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.951055,0.0,0.048945)))
          .setGeometry(new Box().setSize(1.0,4.755277,1.0))))
      .addChild(new Transform().setTranslation(21.0,-5.231468,0.0)
        .addChild(new Billboard().setAxisOfRotation(0.0,0.0,0.0)
          .addChild(new Shape()
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(0.8,0.8,0.0)))
            .setGeometry(new Text().setString(new String[] {"-4.8"})
              .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.454545))))))
      .addChild(new Transform().setTranslation(22.0,-2.486304,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.994521,0.0,0.005479)))
          .setGeometry(new Box().setSize(1.0,4.972608,1.0))))
      .addChild(new Transform().setTranslation(22.0,-5.448798,0.0)
        .addChild(new Billboard().setAxisOfRotation(0.0,0.0,0.0)
          .addChild(new Shape()
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(0.8,0.8,0.0)))
            .setGeometry(new Text().setString(new String[] {"-5.0"})
              .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.454545))))))
      .addChild(new Transform().setTranslation(23.0,-2.486306,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.994522,0.0,0.005478)))
          .setGeometry(new Box().setSize(1.0,4.972611,1.0))))
      .addChild(new Transform().setTranslation(23.0,-5.448802,0.0)
        .addChild(new Billboard().setAxisOfRotation(0.0,0.0,0.0)
          .addChild(new Shape()
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(0.8,0.8,0.0)))
            .setGeometry(new Text().setString(new String[] {"-5.0"})
              .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.454545))))))
      .addChild(new Transform().setTranslation(24.0,-2.377645,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.951058,0.0,0.048942)))
          .setGeometry(new Box().setSize(1.0,4.755289,1.0))))
      .addChild(new Transform().setTranslation(24.0,-5.23148,0.0)
        .addChild(new Billboard().setAxisOfRotation(0.0,0.0,0.0)
          .addChild(new Shape()
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(0.8,0.8,0.0)))
            .setGeometry(new Text().setString(new String[] {"-4.8"})
              .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.454545))))))
      .addChild(new Transform().setTranslation(25.0,-2.165069,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.866028,0.0,0.133972)))
          .setGeometry(new Box().setSize(1.0,4.330138,1.0))))
      .addChild(new Transform().setTranslation(25.0,-4.806329,0.0)
        .addChild(new Billboard().setAxisOfRotation(0.0,0.0,0.0)
          .addChild(new Shape()
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(0.8,0.8,0.0)))
            .setGeometry(new Text().setString(new String[] {"-4.3"})
              .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.454545))))))
      .addChild(new Transform().setTranslation(26.0,-1.85787,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.743148,0.0,0.256852)))
          .setGeometry(new Box().setSize(1.0,3.715739,1.0))))
      .addChild(new Transform().setTranslation(26.0,-4.19193,0.0)
        .addChild(new Billboard().setAxisOfRotation(0.0,0.0,0.0)
          .addChild(new Shape()
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(0.8,0.8,0.0)))
            .setGeometry(new Text().setString(new String[] {"-3.7"})
              .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.454545))))))
      .addChild(new Transform().setTranslation(27.0,-1.469473,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.587789,0.0,0.412211)))
          .setGeometry(new Box().setSize(1.0,2.938946,1.0))))
      .addChild(new Transform().setTranslation(27.0,-3.415136,0.0)
        .addChild(new Billboard().setAxisOfRotation(0.0,0.0,0.0)
          .addChild(new Shape()
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(0.8,0.8,0.0)))
            .setGeometry(new Text().setString(new String[] {"-2.9"})
              .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.454545))))))
      .addChild(new Transform().setTranslation(28.0,-1.016852,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.406741,0.0,0.593259)))
          .setGeometry(new Box().setSize(1.0,2.033704,1.0))))
      .addChild(new Transform().setTranslation(28.0,-2.509895,0.0)
        .addChild(new Billboard().setAxisOfRotation(0.0,0.0,0.0)
          .addChild(new Shape()
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(0.8,0.8,0.0)))
            .setGeometry(new Text().setString(new String[] {"-2.0"})
              .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.454545))))))
      .addChild(new Transform().setTranslation(29.0,-0.519791,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.207916,0.0,0.792084)))
          .setGeometry(new Box().setSize(1.0,1.039582,1.0))))
      .addChild(new Transform().setTranslation(29.0,-1.515773,0.0)
        .addChild(new Billboard().setAxisOfRotation(0.0,0.0,0.0)
          .addChild(new Shape()
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(0.8,0.8,0.0)))
            .setGeometry(new Text().setString(new String[] {"-1.0"})
              .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.454545))))))));
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
	 * @return BarPlot model
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
        X3D thisExampleX3dModel = new BarPlot().getX3dModel();
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
                System.out.println("WARNING: \"Vrml2Sourcebook.Siggraph98Course.BarPlot\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
        else if (hasArguments) // if no arguments provided, this method produces usage warning
                thisExampleX3dModel.handleArguments(args);
	
        if (validate)
        {
            //  System.out.println("--- TODO fix duplicated outputs ---"); // omit when duplicated outputs problem is solved/refactored
		String validationResults = thisExampleX3dModel.validationReport();
            //  System.out.println("-----------------------------------"); // omit when duplicated outputs problem is solved/refactored
                System.out.print("Vrml2Sourcebook.Siggraph98Course.BarPlot self-validation test results: ");
                if (!validationResults.equals("success"))
                    System.out.println();
                System.out.println(validationResults.trim());
        }
    }
}
