####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Query.py
#
# Python package x3d.py package is available on PyPI for import.
#   This approach simplifies Python X3D deployment and use.
#   https://pypi.org/project/x3d
#
# Installation:
#       pip install x3d
# or
#       python -m pip install x3d
#
# Developer options for loading x3d package in other Python programs:
#
#    from x3d import *  # preferred approach, terser source that avoids x3d.* class prefixes
#
# or
#    import x3d         # traditional way to subclass x3d package, all classes require x3d.* prefix,
#                       # but python source is very verbose, for example x3d.Material x3d.Shape etc.
#                       # X3dToPython.xslt stylesheet insertPackagePrefix=true supports this option.
#
####################################################################################################

from x3d import *

newModel=X3D(profile='Immersive',version='3.3',
  head=head(
    children=[
    meta(content='Query.x3d',name='title'),
    meta(content='Query browser state: this world uses the "Browser" object in a script to query information about the VRML browser. That information is sent out as an MFString event that is routed into a Text node string input. The effect is to display a text message showing the Browser information. To give the browser something to do to make it report interesting frame rates, an animating object is displayed beside the text information.',name='description'),
    meta(content='David R. Nadeau',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='originals/query.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0465.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Query.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(info=["Copyright (c) 1998, David R. Nadeau"],title='Query browser state'),
    Viewpoint(description='Entry view'),
    NavigationInfo(),
    Transform(scale=(0.75,0.75,0.75),translation=(-4.0,0.0,0.0),
      children=[
      Inline(url=["Two.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Two.x3d","Two.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Two.wrl"])]),
    Transform(translation=(-1.5,1.25,0.0),
      children=[
      Shape(
        geometry=Text(DEF='Message',string=[""],
          fontStyle=FontStyle(family=["TYPEWRITER"],size=0.65,style_='BOLD')))]),
    TimeSensor(DEF='Timer',cycleInterval=4.0,loop=True),
    Script(DEF='Introspect',
      field=[
      field(accessType='inputOnly',name='trigger',type='SFTime'),
      field(accessType='outputOnly',name='message',type='MFString')],

    sourceCode="""
ecmascript:
		function update( ) {
			message.length = 5;
			message[0] = 'Browser: ' + Browser.getName( );
			message[1] = 'Version: ' + Browser.getVersion( );
			message[2] = 'URL:     ' + Browser.getWorldURL( );
			message[3] = 'Speed:   ' + Browser.getCurrentSpeed( );
			message[4] = 'Frames:  ' + Browser.getCurrentFrameRate( );
		}
		function initialize( ) {
			update( );
		}
		function trigger( t, ts ) {
			update( );
		}
"""),
    ROUTE(fromField='cycleTime',fromNode='Timer',toField='trigger',toNode='Introspect'),
    ROUTE(fromField='message',fromNode='Introspect',toField='set_string',toNode='Message')])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Query.py:')
if        metaDiagnostics(newModel): # built-in utility method in X3D class
    print(metaDiagnostics(newModel)) # display meta info, hint, warning, error, TODO values in this model
# print('check newModel.XML() serialization...')
newModelXML= newModel.XML() # test export method XML() for exceptions during export
newModel.XMLvalidate()
# print(newModelXML) # diagnostic

try:
#   print('check newModel.VRML() serialization...')
    newModelVRML=newModel.VRML() # test export method VRML() for exceptions during export
    # print(prependLineNumbers(newModelVRML)) # debug
    print("Python-to-VRML export of VRML output successful", flush=True)
except Exception as err: # usually BaseException
    # https://stackoverflow.com/questions/18176602/how-to-get-the-name-of-an-exception-that-was-caught-in-python
    print("*** Python-to-VRML export of VRML output failed:", type(err).__name__, err)
    if newModelVRML: # may have failed to generate
        print(prependLineNumbers(newModelVRML, err.lineno))

try:
#   print('check newModel.JSON() serialization...')
    newModelJSON=newModel.JSON() # test export method JSON() for exceptions during export
#   print(prependLineNumbers(newModelJSON)) # debug
    print("Python-to-JSON export of JSON output successful (under development)")
except Exception as err: # usually SyntaxError
    print("*** Python-to-JSON export of JSON output failed:", type(err).__name__, err)
    if newModelJSON: # may have failed to generate
        print(prependLineNumbers(newModelJSON,err.lineno))

print("python Query.py load and self-test diagnostics complete.")
