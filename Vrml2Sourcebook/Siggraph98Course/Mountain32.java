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
import org.web3d.x3d.jsail.Shape.*;

// Javadoc metadata annotations follow, see below for X3DJSAIL Java source code.
/**
 * <p> Mid-resolution mountain. </p>
 <p> Related links: <a href="../../../Siggraph98Course/Mountain32.java">Mountain32.java</a> source, <a href="../../../Siggraph98Course/Mountain32Index.html" target="_top">Mountain32 catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Siggraph98Course/Mountain32.x3d">Mountain32.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Mid-resolution mountain. </td>
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
			<td> originals/mount32.wrl </td>
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
			<td> <a href="http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0201.htm" target="_blank">http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0201.htm</a> </td>
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
			<td> <a href="https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Mountain32.x3d" target="_blank">https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Mountain32.x3d</a> </td>
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

public class Mountain32
{
	/** Default constructor to create this object. */
	public Mountain32 ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
            try { // catch-all
  x3dModel = new X3D().setProfile(X3D.PROFILE_INTERACTIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("Mountain32.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Mid-resolution mountain."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("John L. Moreland"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATOR ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("1 July 1998"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATED ).setContent("2 February 2014"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("originals/mount32.wrl"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.siggraph.org/s98"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.siggraph.org/s98/conference/courses/18.html"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0201.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://www.web3d.org/x3d/content/examples/X3dResources.html"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Mountain32.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setInfo(new String[] {"copyright (c) 1997, John L. Moreland"}).setTitle("Mid-res Mountain"))
    .addChild(new Viewpoint().setDescription("Entry view").setOrientation(1.0,0.0,0.0,-0.2).setPosition(1.2,0.9,4.0))
    .addChild(new NavigationInfo())
    .addChild(new Shape()
      .setAppearance(new Appearance()
        .setMaterial(new Material()))
      .setGeometry(new ElevationGrid().setXDimension(32).setXSpacing(0.08).setZDimension(32).setZSpacing(0.08).setHeight(getElevationGrid_4_24_height()))));
            }
            catch (Exception ex)
            {       
                System.err.println ("*** Further hints on X3DJSAIL errors and exceptions at");
                System.err.println ("*** https://www.web3d.org/specifications/java/X3DJSAIL.html");
                throw (ex);
            }
	}
	// end of initialize() method

		/** Define subarrays using type double[] */
		private double[] getElevationGrid_4_24_height_1()
		{
			double[] value = {0.019608,0.027451,0.031373,0.035294,0.043137,0.043137,0.05098,0.047059,0.054902,0.054902,0.054902,0.054902,0.066667,0.062745,0.062745,0.062745,0.062745,0.062745,0.062745,0.058824,0.058824,0.062745,0.054902,0.054902,0.047059,0.05098,0.047059,0.039216,0.035294,0.031373,0.031373,0.019608,0.019608,0.027451,0.039216,0.039216,0.047059,0.047059,0.05098,0.047059,0.058824,0.058824,0.062745,0.062745,0.066667,0.070588,0.066667,0.070588,0.070588,0.066667,0.062745,0.066667,0.07451,0.070588,0.078431,0.07451,0.062745,0.062745,0.054902,0.047059,0.043137,0.039216,0.031373,0.027451,0.035294,0.039216,0.035294,0.05098,0.039216,0.058824,0.054902,0.05098,0.062745,0.066667,0.066667,0.066667,0.070588,0.070588,0.070588,0.070588,0.070588,0.066667,0.070588,0.07451,0.098039,0.121569,0.129412,0.113725,0.086275,0.101961,0.078431,0.066667,0.066667,0.047059,0.043137,0.035294,0.031373,0.043137,0.047059,0.05098,0.058824,0.066667,0.066667,0.062745,0.062745,0.066667,0.058824,0.070588,0.058824,0.070588,0.070588,0.062745,0.062745,0.070588,0.070588,0.082353,0.113725,0.160784,0.227451,0.196078,0.196078,0.145098,0.12549,0.105882,0.062745,0.05098,0.047059,0.031373,0.039216,0.047059,0.05098,0.047059,0.058824,0.070588,0.07451,0.066667,0.066667,0.066667,0.062745,0.058824,0.054902,0.062745,0.062745,0.054902,0.058824,0.062745,0.066667,0.082353,0.145098,0.247059,0.27451,0.270588,0.227451,0.219608,0.168627,0.121569,0.07451,0.058824,0.05098,0.043137,0.047059,0.05098,0.054902,0.062745,0.062745,0.07451,0.070588,0.070588,0.058824,0.058824,0.062745,0.05098,0.047059,0.054902,0.039216,0.058824,0.054902,0.05098,0.058824,0.086275,0.129412,0.254902,0.333333,0.305882,0.294118,0.25098,0.211765,0.129412,0.070588,0.058824,0.05098,0.047059,0.035294,0.05098,0.058824,0.05098,0.070588,0.078431,0.07451,0.066667,0.062745,0.054902,0.058824,0.047059,0.047059,0.039216,0.039216,0.035294,0.054902,0.066667,0.058824,0.090196,0.211765,0.301961,0.356863,0.364706,0.32549,0.298039,0.223529,0.121569,0.07451,0.058824,0.05098,0.047059,0.047059,0.058824,0.058824,0.066667,0.070588,0.078431,0.078431,0.062745,0.058824,0.05098,0.039216,0.047059,0.039216,0.039216,0.043137,0.05098,0.082353,0.117647,0.07451,0.152941,0.219608,0.32549,0.384314,0.372549,0.356863,0.317647,0.247059,0.105882,0.066667,0.054902,0.054902,0.043137,0.054902,0.05098,0.070588,0.066667,0.07451,0.086275,0.078431,0.058824,0.054902,0.043137,0.047059,0.035294,0.035294,0.031373,0.027451,0.05098,0.086275,0.235294,0.129412,0.160784,0.231373,0.286275,0.372549,0.329412,0.321569,0.254902,0.231373,0.172549,0.082353,0.05098,0.058824,0.058824,0.058824,0.062745,0.066667,0.078431,0.082353,0.086275,0.078431,0.062745,0.039216,0.039216,0.035294,0.035294,0.027451,0.027451,0.035294,0.098039,0.203922,0.243137,0.305882,0.270588,0.258824,0.254902,0.239216,0.160784,0.152941,0.141176,0.129412,0.117647,0.090196,0.062745,0.058824,0.05098,0.054902,0.062745,0.066667,0.070588,0.082353,0.078431,0.07451,0.047059,0.035294,0.031373,0.023529,0.027451,0.027451,0.035294,0.058824,0.239216,0.454902,0.541176,0.517647,0.4,0.239216,0.129412,0.121569,0.086275,0.094118,0.086275,0.078431,0.070588,0.058824,0.070588,0.058824,0.062745,0.05098,0.062745,0.062745,0.070588,0.082353,0.078431,0.066667,0.054902,0.043137,0.027451,0.023529,0.031373,0.043137,0.098039,0.152941,0.419608,0.580392,0.796078,0.709804,0.427451,0.227451,0.137255,0.070588,0.05098,0.047059,0.047059,0.054902,0.058824,0.066667,0.07451,0.066667,0.062745,0.062745,0.062745,0.066667,0.066667,0.07451,0.078431,0.047059,0.031373,0.023529,0.023529,0.027451,0.039216,0.129412,0.227451,0.47451,0.733333,0.815686,0.854902,0.701961,0.552941,0.317647,0.145098,0.054902,0.027451,0.035294,0.043137,0.05098,0.062745,0.066667,0.066667,0.066667,0.062745,0.066667,0.066667,0.066667,0.070588,0.07451,0.062745,0.058824,0.043137,0.031373,0.031373,0.047059,0.058824,0.137255,0.494118,0.803922,0.913725,0.917647,0.890196,0.807843,0.486275,0.184314,0.039216,0.031373,0.027451,0.031373,0.035294,0.047059,0.05098,0.062745,0.066667,0.062745,0.062745,0.066667,0.066667,0.062745,0.058824,0.066667,0.054902,0.05098,0.05098,0.031373,0.027451,0.082353,0.211765,0.27451,0.537255,0.780392,0.929412,0.956863,0.909804,0.827451,0.541176,0.25098,0.117647,0.054902,0.031373,0.035294,0.039216,0.047059,0.05098,0.062745,0.062745,0.058824,0.066667,0.070588,0.070588,0.070588,0.066667,0.054902,0.054902,0.054902,0.058824,0.058824,0.027451,0.035294,0.203922,0.576471,0.780392,0.831373,0.956863,0.972549,0.933333,0.878431,0.678431,0.505882,0.14902,0.058824,0.031373,0.035294,0.039216,0.039216,0.05098,0.062745,0.062745,0.062745,0.070588,0.078431,0.086275,0.078431,0.070588,0.058824,0.058824,0.054902,0.066667,0.113725,0.066667,0.07451,0.086275,0.282353,0.666667,0.858824,0.92549,0.945098,0.937255,0.745098,0.545098,0.203922,0.113725,0.031373,0.031373,0.027451,0.027451,0.031373,0.039216,0.043137,0.054902,0.062745,0.058824,0.070588,0.086275,0.094118,0.086275,0.082353,0.058824,0.062745,0.094118,0.121569,0.172549,0.156863,0.117647,0.176471,0.403922,0.611765,0.780392,0.909804,0.862745,0.85098,0.65098,0.286275,0.101961,0.043137,0.031373,0.023529,0.035294,0.043137,0.05098,0.05098,0.054902,0.066667,0.066667,0.070588,0.07451,0.094118,0.121569,0.109804,0.090196,0.117647,0.133333,0.192157,0.258824,0.282353,0.258824,0.231373,0.286275,0.517647,0.803922,0.92549,0.945098,0.929412,0.803922,0.423529,0.145098,0.027451,0.023529,0.031373,0.043137,0.05098,0.054902,0.058824,0.066667,0.066667,0.062745,0.062745,0.070588,0.082353,0.121569,0.176471,0.133333,0.192157,0.219608,0.270588,0.32549,0.352941,0.32549,0.356863,0.435294,0.682353,0.847059,0.941176,0.92549,0.901961,0.647059,0.14902,0.066667,0.027451,0.031373,0.039216,0.031373,0.043137,0.047059,0.058824,0.058824,0.062745,0.062745,0.058824,0.070588,0.082353,0.098039,0.160784,0.235294,0.223529,0.290196,0.329412,0.345098,0.329412,0.352941,0.458824,0.568627,0.733333,0.87451,0.901961,0.882353,0.858824,0.741176,0.607843,0.384314,0.164706,0.066667,0.054902,0.043137,0.047059,0.070588,0.062745,0.070588,0.062745,0.062745,0.054902,0.07451,0.094118,0.14902,0.207843,0.231373,0.266667,0.301961,0.286275,0.294118,0.270588,0.262745,0.447059,0.709804,0.792157,0.839216,0.85098,0.819608,0.819608,0.776471,0.741176,0.572549,0.258824,0.121569,0.101961,0.086275,0.105882,0.109804,0.078431,0.07451,0.066667,0.058824,0.058824,0.062745,0.090196,0.129412,0.180392,0.231373,0.254902,0.262745,0.243137,0.184314,0.164706,0.266667,0.443137,0.654902,0.768627,0.788235,0.796078,0.741176,0.772549,0.709804,0.701961,0.545098,0.298039,0.298039,0.290196,0.215686,0.152941,0.101961,0.098039,0.086275,0.066667,0.066667,0.054902,0.062745,0.078431,0.078431,0.145098,0.203922,0.207843,0.121569,0.14902,0.121569,0.082353,0.188235,0.411765,0.580392,0.698039,0.729412,0.701961,0.690196,0.690196,0.67451,0.631373,0.576471,0.486275,0.462745,0.396078,0.235294,0.152941,0.152941,0.113725,0.070588,0.070588,0.062745,0.05098,0.058824,0.066667,0.094118,0.101961,0.137255,0.152941,0.137255,0.086275,0.078431,0.094118,0.141176,0.341176,0.529412,0.611765,0.619608,0.662745,0.654902,0.584314,0.6,0.596078,0.529412,0.470588,0.462745,0.396078,0.270588,0.282353,0.211765,0.137255,0.078431,0.058824,0.062745,0.05098,0.05098,0.066667,0.070588,0.078431,0.07451,0.101961,0.082353,0.066667,0.062745,0.070588,0.156863,0.278431,0.329412,0.505882,0.568627,0.576471,0.576471,0.545098,0.545098,0.513726,0.501961,0.466667,0.407843,0.360784,0.282353,0.227451,0.129412,0.098039,0.066667,0.066667,0.05098,0.047059,0.043137,0.054902,0.054902,0.062745,0.066667,0.070588,0.062745,0.058824,0.058824,0.066667,0.101961,0.152941,0.301961,0.388235,0.501961,0.368627,0.376471,0.47451,0.439216,0.439216,0.443137,0.380392,0.368627,0.32549,0.239216,0.164706,0.098039,0.058824,0.058824,0.05098,0.054902,0.043137,0.05098,0.058824,0.058824,0.058824,0.066667,0.070588,0.066667,0.062745,0.062745,0.078431,0.101961,0.156863,0.262745,0.305882,0.321569,0.192157,0.258824,0.270588,0.243137,0.376471,0.380392,0.341176,0.266667,0.227451,0.203922,0.121569,0.094118,0.062745,0.05098,0.05098,0.035294,0.035294,0.047059,0.05098,0.058824,0.058824,0.062745,0.062745,0.066667,0.066667,0.062745,0.07451,0.098039,0.133333,0.129412,0.192157,0.192157,0.172549,0.090196,0.098039,0.223529,0.290196,0.266667,0.27451,0.2,0.133333,0.117647,0.105882,0.066667,0.054902,0.047059,0.047059,0.047059,0.023529,0.043137,0.043137,0.047059,0.054902,0.058824,0.058824,0.054902,0.062745,0.066667,0.070588,0.082353,0.086275,0.070588,0.121569,0.160784,0.098039,0.066667,0.113725,0.164706,0.184314,0.14902,0.117647,0.113725,0.090196,0.054902,0.082353,0.062745,0.043137,0.047059,0.043137,0.035294,0.035294,0.035294,0.043137,0.043137,0.05098,0.05098,0.054902,0.062745,0.062745,0.062745,0.066667,0.062745,0.054902,0.078431,0.082353,0.090196,0.098039,0.054902,0.07451,0.098039,0.098039,0.086275,0.078431,0.066667,0.062745,0.047059,0.062745,0.062745,0.054902,0.047059,0.039216,0.031373,0.023529,0.031373,0.031373,0.043137,0.047059,0.05098,0.054902,0.062745};
			return value;
		}
		private double[] getElevationGrid_4_24_height_2()
		{
			double[] value = {0.058824,0.062745,0.058824,0.062745,0.058824,0.066667,0.066667,0.062745,0.078431,0.062745,0.066667,0.078431,0.078431,0.062745,0.062745,0.062745,0.05098,0.043137,0.054902,0.05098,0.047059,0.039216,0.039216,0.031373};
			return value;
		}

		/** Large attribute array: ElevationGrid height field, scene-graph level=4, element #24, 1024 total numbers.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFFloat getElevationGrid_4_24_height()
		{
			MFFloat ElevationGrid_4_24_height = new MFFloat()/*2.finalize*/
				.append(new MFFloat(getElevationGrid_4_24_height_1()))
				.append(new MFFloat(getElevationGrid_4_24_height_2()));
			return ElevationGrid_4_24_height;
		}

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return Mountain32 model
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
        X3D thisExampleX3dModel = new Mountain32().getX3dModel();
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
                System.out.println("WARNING: \"Vrml2Sourcebook.Siggraph98Course.Mountain32\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
        else if (hasArguments) // if no arguments provided, this method produces usage warning
                thisExampleX3dModel.handleArguments(args);
	
        if (validate)
        {
            //  System.out.println("--- TODO fix duplicated outputs ---"); // omit when duplicated outputs problem is solved/refactored
		String validationResults = thisExampleX3dModel.validationReport();
            //  System.out.println("-----------------------------------"); // omit when duplicated outputs problem is solved/refactored
                System.out.print("Vrml2Sourcebook.Siggraph98Course.Mountain32 self-validation test results: ");
                if (!validationResults.equals("success"))
                    System.out.println();
                System.out.println(validationResults.trim());
        }
    }
}
