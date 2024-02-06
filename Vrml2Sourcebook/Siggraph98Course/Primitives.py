####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Primitives.py
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
    meta(content='Primitives.x3d',name='title'),
    meta(content='The Primitives on Pedestals scene highlights the geometry primitives, placing each one above a Gothic pedestal. Of note is that the pedestal itself is built using only the geometry primitive nodes.',name='description'),
    meta(content='David R. Nadeau',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='Primitives.png',name='Image'),
    meta(content='Pedestal.x3d',name='reference'),
    meta(content='originals/prim.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0030.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Primitives.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(info=["Copyright (c) 1997, David R. Nadeau"],title='VRML Primitives'),
    Viewpoint(description='Entry view',orientation=(0.0,1.0,0.0,0.52),position=(5.0,1.6,8.0)),
    NavigationInfo(headlight=False,type='"WALK" "ANY"'),
    Background(skyAngle=[1.37,1.57,1.77],skyColor=[(0.0,0.0,0.0),(0.0,0.0,0.0),(0.0,0.1,0.5),(0.0,0.0,0.0)]),
    PointLight(ambientIntensity=0.2,color=(0.7,0.7,0.7),location=(0.0,8.0,10.0)),
    Transform(translation=(-3.0,0.0,0.0),
      children=[
      Inline(DEF='Pedestal',url=["Pedestal.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Pedestal.x3d","Pedestal.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Pedestal.wrl"]),
      Transform(scale=(0.375,0.375,0.375),translation=(0.0,2.5,0.0),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(1.0,0.2,0.2))),
          geometry=Box(),)])]),
    Transform(translation=(-1.0,0.0,0.0),
      children=[
      Inline(USE='Pedestal'),
      Transform(scale=(0.375,0.375,0.375),translation=(0.0,2.5,0.0),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(0.0,1.0,0.0))),
          geometry=Cone(),)])]),
    Transform(translation=(1.0,0.0,0.0),
      children=[
      Inline(USE='Pedestal'),
      Transform(scale=(0.375,0.375,0.375),translation=(0.0,2.5,0.0),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(0.0,0.8,1.0))),
          geometry=Cylinder(),)])]),
    Transform(translation=(3.0,0.0,0.0),
      children=[
      Inline(USE='Pedestal'),
      Transform(scale=(0.375,0.375,0.375),translation=(0.0,2.5,0.0),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(1.0,1.0,0.0))),
          geometry=Sphere(),)])]),
    Transform(translation=(5.0,0.0,0.0),
      children=[
      Inline(USE='Pedestal'),
      Transform(scale=(0.375,0.375,0.375),translation=(0.0,2.2,0.0),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(1.0,1.0,1.0))),
          geometry=Text(string=["Text"],
            fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],size=2.0,style_='BOLD')))])]),
    Shape(
      appearance=Appearance(
        textureTransform=TextureTransform(scale=(20.0,20.0)),
        material=Material(ambientIntensity=0.1),
        texture=ImageTexture(url=["stone2.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/stone2.jpg"])),
      geometry=IndexedFaceSet(coordIndex=[0,1,2,3,-1],solid=False,
        coord=Coordinate(point=[(-10.0,0.0,10.0),(10.0,0.0,10.0),(10.0,0.0,-10.0),(-10.0,0.0,-10.0)])))])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Primitives.py:')
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

print("python Primitives.py load and self-test diagnostics complete.")
