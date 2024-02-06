####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Figure16_4ColoredBookFacesWithAxes.py
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

newModel=X3D(profile='Immersive',version='3.0',
  head=head(
    children=[
    meta(content='Figure16_4ColoredBookFacesWithAxes.x3d',name='title'),
    meta(content='Figure 16.4, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland',name='creator'),
    meta(content='http://www.wiley.com/legacy/compbooks/vrml2sbk/ch16/16fig04.htm',name='reference'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='26 August 2000',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='A book with its faces individually colored using colors from a Color node.',name='description'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter16Color/Figure16_4ColoredBookFacesWithAxes.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='Figure16_4ColoredBookFacesWithAxes.x3d'),
    Viewpoint(description='Book',orientation=(1,0,0,1.4),position=(0,-1,0.3)),
    Transform(DEF='SPINNING_VIEWPOINT_PARENT_TRANSFORM',
      children=[
      Viewpoint(description='Spinning viewpoint',orientation=(1,0,0,1.4),position=(0,-1,0.3))]),
    #  Shift book up so that it stands vertically on ground plane 
    Transform(translation=(0,0.115,0),
      children=[
      Shape(
        #  no appearance, use Color node colors instead 
        geometry=IndexedFaceSet(colorIndex=[0,0,0,1,1,1],colorPerVertex=False,coordIndex=[0,1,2,3,-1,7,6,5,4,-1,0,3,7,4,-1,0,4,5,1,-1,1,5,6,2,-1,2,6,7,3],
          coord=Coordinate(point=[(-0.095,-0.115,0.04),(0.095,-0.115,0.04),(0.095,0.115,0.04),(-0.095,0.115,0.04),(-0.095,-0.115,0.00),(0.095,-0.115,0.00),(0.095,0.115,0.00),(-0.095,0.115,0.00)]),
          color=Color(color=[(0.7,0.5,0.2),(0.8,0.8,0.8)])))]),
    #  Adding this Inline reference to another scene superimposes X3D/VRML coordinate system axes. 
    Transform(scale=(0.2,0.2,0.2),
      children=[
      Inline(DEF='CoordinateAxes',url=["../../X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.x3d","https://www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.x3d","https://savage.nps.edu/Savage/Tools/Authoring/CoordinateAxes.x3d","../../X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.wrl","https://www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.wrl","https://savage.nps.edu/Savage/Tools/Authoring/CoordinateAxes.wrl"])]),
    TimeSensor(DEF='TIMER',cycleInterval=4,loop=True),
    #  Note direction of rotation is negative, since we are rotating the position of a Viewpoint looking down the default -Z axis 
    OrientationInterpolator(DEF='SPINNER',key=[0,.5,1],keyValue=[(0,0,1,0),(0,0,1,-3.1416),(0,0,1,-6.2832)]),
    ROUTE(fromField='fraction_changed',fromNode='TIMER',toField='set_fraction',toNode='SPINNER'),
    ROUTE(fromField='value_changed',fromNode='SPINNER',toField='set_rotation',toNode='SPINNING_VIEWPOINT_PARENT_TRANSFORM')])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Figure16_4ColoredBookFacesWithAxes.py:')
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

print("python Figure16_4ColoredBookFacesWithAxes.py load and self-test diagnostics complete.")
