import org.web3d.x3d.jsail.Core.*;
import org.web3d.x3d.jsail.fields.*;

// Javadoc metadata annotations follow, see below for X3DJSAIL Java source code.
/**
 * <p> *enter description here, short-sentence summaries preferred*. </p>
 <p> Related links: newScene.java source, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">newScene&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> *enter FileNameWithNoAbbreviations.x3d here* </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> *enter description here, short-sentence summaries preferred* </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> *enter name of original author here* </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> translator </i> </td>
			<td> *if manually translating VRML-to-X3D, enter name of person translating here* </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> *enter date of initial version here* </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> translated </i> </td>
			<td> *enter date of translation here* </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 9 July 2023 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> version </i> </td>
			<td> *enter version here, if any* </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> *enter reference citation or relative/online url here* </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> *enter additional url/bibliographic reference information here* </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> requires </i> </td>
			<td> *enter reference resource here if required to support function, delivery, or coherence of content* </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> rights </i> </td>
			<td> *enter copyright information here* Example: Copyright (c) Web3D Consortium Inc. 2006 to present </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> drawing </i> </td>
			<td> *enter drawing filename/url here* </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> Image </i> </td>
			<td> *enter image filename/url here* </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> MovingImage </i> </td>
			<td> *enter movie filename/url here* </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> photo </i> </td>
			<td> *enter photo filename/url here* </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> subject </i> </td>
			<td> *enter subject keywords here* </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> accessRights </i> </td>
			<td> *enter permission statements or url here* </td>
		</tr>
		<tr style="color:burntorange">
			<td style="text-align:right; vertical-align: text-top;"> <i> warning </i> </td>
			<td> *insert any known warnings, bugs or errors here* </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> *enter online Uniform Resource Identifier (URI) or Uniform Resource Locator (URL) address for this file here* </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> X3D-Edit 4.0, <a href="https://savage.nps.edu/X3D-Edit" target="_blank">https://savage.nps.edu/X3D-Edit</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> license </i> </td>
			<td> <a href="../license.html">../license.html</a> </td>
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

	* @author *enter name of original author here*
 */

public class newScene
{
	/** Default constructor to create this object. */
	public newScene ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
            try { // catch-all
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_4_0)
  .setHead(new head()
    .addComments(" Authors need to replace asterisked values or delete unneeded meta tags as appropriate ")
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("*enter FileNameWithNoAbbreviations.x3d here*"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("*enter description here, short-sentence summaries preferred*"))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("*enter name of original author here*"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATOR ).setContent("*if manually translating VRML-to-X3D, enter name of person translating here*"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("*enter date of initial version here*"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATED ).setContent("*enter date of translation here*"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("9 July 2023"))
    .addMeta(new meta().setName(meta.NAME_VERSION    ).setContent("*enter version here, if any*"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("*enter reference citation or relative/online url here*"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("*enter additional url/bibliographic reference information here*"))
    .addMeta(new meta().setName(meta.NAME_REQUIRES   ).setContent("*enter reference resource here if required to support function, delivery, or coherence of content*"))
    .addMeta(new meta().setName(meta.NAME_RIGHTS     ).setContent("*enter copyright information here* Example: Copyright (c) Web3D Consortium Inc. 2006 to present"))
    .addMeta(new meta().setName(meta.NAME_DRAWING    ).setContent("*enter drawing filename/url here*"))
    .addMeta(new meta().setName(meta.NAME_IMAGE      ).setContent("*enter image filename/url here*"))
    .addMeta(new meta().setName(meta.NAME_MOVINGIMAGE).setContent("*enter movie filename/url here*"))
    .addMeta(new meta().setName(meta.NAME_PHOTO      ).setContent("*enter photo filename/url here*"))
    .addMeta(new meta().setName(meta.NAME_SUBJECT    ).setContent("*enter subject keywords here*"))
    .addMeta(new meta().setName(meta.NAME_ACCESSRIGHTS).setContent("*enter permission statements or url here*"))
    .addMeta(new meta().setName(meta.NAME_WARNING    ).setContent("*insert any known warnings, bugs or errors here*"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("*enter online Uniform Resource Identifier (URI) or Uniform Resource Locator (URL) address for this file here*"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 4.0, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html"))
    .addComments(" Additional authoring resources for meta tags: http://www.dublincore.org/documents/dcmi-terms http://www.dublincore.org/documents/dces https://www.w3.org/TR/html5/document-metadata.html#the-meta-element http://www.w3.org/TR/html4/struct/global.html#h-7.4.4 http://vancouver-webpages.com/META http://vancouver-webpages.com/META/about-mk-metas2.html ")
    .addComments(" Additional authoring resources for language codes: https://tools.ietf.org/html/bcp47 http://www.loc.gov/standards/iso639-2/langhome.html http://www.iana.org/numbers.html#index_L "))
  .setScene(new Scene()
    .addComments(" Scene graph nodes are added here "));
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
	 * @return newScene model
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
        X3D thisExampleX3dModel = new newScene().getX3dModel();
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
                System.out.println("WARNING: \"newScene\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
        else if (hasArguments) // if no arguments provided, this method produces usage warning
                thisExampleX3dModel.handleArguments(args);
	
        if (validate)
        {
            //  System.out.println("--- TODO fix duplicated outputs ---"); // omit when duplicated outputs problem is solved/refactored
		String validationResults = thisExampleX3dModel.validationReport();
            //  System.out.println("-----------------------------------"); // omit when duplicated outputs problem is solved/refactored
                System.out.print("newScene self-validation test results: ");
                if (!validationResults.equals("success"))
                    System.out.println();
                System.out.println(validationResults.trim());
        }
    }
}
