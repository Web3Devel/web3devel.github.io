####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python AnimatedGrid.py
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
    meta(content='AnimatedGrid.x3d',name='title'),
    meta(content='Animated grid world illustrates the use of a script to change the whichChoice field of a Switch node. When animated, this enables switching among different pieces of geometry, such as the separate ElevationGrid scenes shown in this example.',name='description'),
    meta(content='John L. Moreland',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='originals/animgrid.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0495.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/AnimatedGrid.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(info=["Copyright (c) 1998, John L. Moreland"],title='Animated grid'),
    Viewpoint(description='Entry view',orientation=(1.0,0.0,0.0,-0.83),position=(0.0,12.0,12.0)),
    NavigationInfo(headlight=False,type='"EXAMINE"'),
    DirectionalLight(direction=(1.0,-1.0,-1.0)),
    DirectionalLight(direction=(-1.0,1.0,1.0)),
    Switch(DEF='Grids',whichChoice=0,
      children=[
      Inline(bboxSize=(14.0,5.0,14.0),url=["Terrain00.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Terrain00.x3d","Terrain00.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Terrain00.wrl"]),
      Inline(bboxSize=(14.0,5.0,14.0),url=["Terrain01.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Terrain01.x3d","Terrain01.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Terrain01.wrl"]),
      Inline(bboxSize=(14.0,5.0,14.0),url=["Terrain02.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Terrain02.x3d","Terrain02.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Terrain02.wrl"]),
      Inline(bboxSize=(14.0,5.0,14.0),url=["Terrain03.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Terrain03.x3d","Terrain03.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Terrain03.wrl"]),
      Inline(bboxSize=(14.0,5.0,14.0),url=["Terrain04.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Terrain04.x3d","Terrain04.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Terrain04.wrl"]),
      Inline(bboxSize=(14.0,5.0,14.0),url=["Terrain05.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Terrain05.x3d","Terrain05.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Terrain05.wrl"]),
      Inline(bboxSize=(14.0,5.0,14.0),url=["Terrain06.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Terrain06.x3d","Terrain06.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Terrain06.wrl"]),
      Inline(bboxSize=(14.0,5.0,14.0),url=["Terrain07.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Terrain07.x3d","Terrain07.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Terrain07.wrl"]),
      Inline(bboxSize=(14.0,5.0,14.0),url=["Terrain08.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Terrain08.x3d","Terrain08.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Terrain08.wrl"]),
      Inline(bboxSize=(14.0,5.0,14.0),url=["Terrain09.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Terrain09.x3d","Terrain09.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Terrain09.wrl"])]),
    TimeSensor(DEF='Clock',cycleInterval=2.0,loop=True,startTime=1.0),
    Script(DEF='Switcher',
      field=[
      field(accessType='outputOnly',name='choice_changed',type='SFInt32'),
      field(accessType='initializeOnly',name='numberOfChoices',type='SFInt32',value=10),
      field(accessType='inputOnly',name='set_fraction',type='SFFloat')],

    sourceCode="""
ecmascript:
    function set_fraction( frac, stamp ) {
            choice_changed = frac * numberOfChoices;
    }
"""),
    ROUTE(fromField='fraction_changed',fromNode='Clock',toField='set_fraction',toNode='Switcher'),
    ROUTE(fromField='choice_changed',fromNode='Switcher',toField='set_whichChoice',toNode='Grids')])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for AnimatedGrid.py:')
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

print("python AnimatedGrid.py load and self-test diagnostics complete.")
