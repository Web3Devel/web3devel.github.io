####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Figure16_5LogFireColoredFacesWithAxes.py
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
    meta(content='Figure16_5LogFireColoredFacesWithAxes.x3d',name='title'),
    meta(content='Figure 16.5, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland',name='creator'),
    meta(content='http://www.wiley.com/legacy/compbooks/vrml2sbk/ch16/16fig05.htm',name='reference'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='26 August 2000',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='A log and fire using faces colored vertex-by-vertex with colors from a Color node.',name='description'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter16Color/Figure16_5LogFireColoredFacesWithAxes.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='Figure16_5LogFireColoredFacesWithAxes.x3d'),
    Viewpoint(description='Log fire'),
    Transform(translation=(0,0.8,0),
      children=[
      Transform(rotation=(0,0,1,-1.57),translation=(0,-0.4,0),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(0.5,0.3,0))),
          geometry=Cylinder(height=2.9,radius=0.4))]),
      Shape(DEF='Flames',
        geometry=IndexedFaceSet(colorIndex=[3,4,5,-1,0,1,2,-1,3,4,5,-1,0,1,2,-1],coordIndex=[0,1,2,-1,3,4,5,-1,6,7,8,-1,9,10,11,-1],solid=False,
          coord=Coordinate(point=[(-0.7,0,0.00),(-0.8,1.5,0.00),(-1.0,0,0.00),(-0.5,0,0.01),(-0.7,1.2,0.01),(-0.9,0,0.01),(-0.1,0,0.00),(-0.2,1.6,0.00),(-0.4,0,0.00),(0.3,0,0.01),(0.2,1.0,0.01),(0.0,0,0.00)]),
          color=Color(color=[(1.0,0,0),(1,0.5,0),(1,0.1,0),(0.8,0,0),(1,0.9,0),(1,0.0,0)]))),
      Transform(scale=(1,1.3,1),translation=(0.8,0,0.02),
        children=[
        Shape(USE='Flames')]),
      Transform(scale=(1,0.5,1),translation=(1.1,0,0.04),
        children=[
        Shape(USE='Flames')]),
      Transform(scale=(1,1.1,1),translation=(-0.3,0,0.06),
        children=[
        Shape(USE='Flames')]),
      Transform(scale=(1,0.4,1),translation=(-0.1,0,0.08),
        children=[
        Shape(USE='Flames')]),
      Transform(rotation=(0,1,0,3.1416),scale=(1,1.1,1),translation=(0.4,0,0.1),
        children=[
        Shape(USE='Flames')])]),
    #  Adding this Inline reference to another scene superimposes X3D/VRML coordinate system axes. 
    Transform(scale=(3,3,3),
      children=[
      Inline(DEF='CoordinateAxes',url=["../../X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.x3d","https://www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.x3d","https://savage.nps.edu/Savage/Tools/Authoring/CoordinateAxes.x3d","../../X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.wrl","https://www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.wrl","https://savage.nps.edu/Savage/Tools/Authoring/CoordinateAxes.wrl"])])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Figure16_5LogFireColoredFacesWithAxes.py:')
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

print("python Figure16_5LogFireColoredFacesWithAxes.py load and self-test diagnostics complete.")