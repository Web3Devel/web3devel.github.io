####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Figure08_4OrientationInterpolatorWithAxes.py
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
    meta(content='Figure08_4OrientationInterpolatorWithAxes.x3d',name='title'),
    meta(content='Figure 8.4, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland',name='creator'),
    meta(content='http://www.wiley.com/legacy/compbooks/vrml2sbk/ch08/08fig04.htm',name='reference'),
    meta(content='Kevin S. Anderson',name='translator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='8 August 2000',name='created'),
    meta(content='1 July 2023',name='modified'),
    meta(content='Figure08_4OrientationInterpolatorWithAxes.png',name='Image'),
    meta(content='Animation that rotates a coordinate system and the column built within it, with coordinate axes superimposed to show X3D/VRML directions',name='description'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter08AnimatingPositionOrientationScale/Figure08_4OrientationInterpolatorWithAxes.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='Figure08_4OrientationInterpolatorWithAxes.x3d'),
    Viewpoint(description='Figure 8.4 OrientationInterpolatorWithAxes',position=(0,0,4)),
    #  Rotating Cylinder 
    Group(
      children=[
      Transform(DEF='Column',
        children=[
        Shape(
          geometry=Cylinder(height=1.0,radius=0.2),
          appearance=Appearance(
            material=Material(diffuseColor=(1,0,0),shininess=0.3))),
        Transform(
          children=[
          Inline(DEF='CoordinateAxes',url=["../../X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.x3d","https://www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.x3d","https://savage.nps.edu/Savage/Tools/Authoring/CoordinateAxes.x3d","../../X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.wrl","https://www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.wrl","https://savage.nps.edu/Savage/Tools/Authoring/CoordinateAxes.wrl"])])]),
      TimeSensor(DEF='Clock',cycleInterval=4.0,loop=True),
      OrientationInterpolator(DEF='ColumnPath',key=[0.0,0.50,1.0],keyValue=[(0.0,0.0,1.0,0.0),(0.0,0.0,1.0,3.14),(0.0,0.0,1.0,6.28)])]),
    #  Adding this Inline reference to another scene superimposes X3D/VRML coordinate system axes. 
    Transform(scale=(2,2,2),
      children=[
      Inline(USE='CoordinateAxes')]),
    ROUTE(fromField='fraction_changed',fromNode='Clock',toField='set_fraction',toNode='ColumnPath'),
    ROUTE(fromField='value_changed',fromNode='ColumnPath',toField='set_rotation',toNode='Column')])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Figure08_4OrientationInterpolatorWithAxes.py:')
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

print("python Figure08_4OrientationInterpolatorWithAxes.py load and self-test diagnostics complete.")
