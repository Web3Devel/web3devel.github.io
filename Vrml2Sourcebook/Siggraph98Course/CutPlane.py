####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python CutPlane.py
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
    meta(content='CutPlane.x3d',name='title'),
    meta(content='Cutting plane demo where users can drag two slice interfaces to show the cross sections of a volume.',name='description'),
    meta(content='David R. Nadeau',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='CutPlane.png',name='Image'),
    meta(content='originals/cutplane.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0008.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0498.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/CutPlane.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    #  This sliding cutting plane world illustrates the use of the 'SlidingPlane' prototype node defined in the external file 'cut.wrl'. That node creates a plane that slides back and forth, changing the texture on it based upon the plane's X position. 
    children=[
    ExternProtoDeclare(name='TexturePlane',url=["Cut.x3d#TexturePlane","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Cut.x3d#TexturePlane","Cut.wrl#TexturePlane","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Cut.wrl#TexturePlane"],
      field=[
      field(accessType='initializeOnly',name='textures',type='MFNode'),
      field(accessType='inputOnly',name='set_fraction',type='SFFloat')]),
    ExternProtoDeclare(name='SlidingPlane',url=["Cut.x3d#SlidingPlane","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Cut.x3d#SlidingPlane","Cut.wrl#SlidingPlane","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Cut.wrl#SlidingPlane"],
      field=[
      field(accessType='initializeOnly',name='textures',type='MFNode'),
      field(accessType='initializeOnly',name='minMaxX',type='SFVec2f'),
      field(accessType='initializeOnly',name='initialX',type='SFFloat')]),
    WorldInfo(info=["Copyright (c) 1997, David R. Nadeau"],title='Cutting Plane'),
    Viewpoint(description='Entry view',orientation=(0.0,1.0,0.0,0.785),position=(4.0,0.4,2.5)),
    NavigationInfo(),
    Background(skyAngle=[1.57,1.87],skyColor=[(0.0,0.0,0.0),(0.0,0.0,0.0),(0.0,0.1,0.3)]),
    Shape(
      appearance=Appearance(
        textureTransform=TextureTransform(translation=(0.5,0.5)),
        texture=ImageTexture(url=["grill.png","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/grill.png"])),
      geometry=IndexedFaceSet(coordIndex=[0,1,2,3,-1,4,5,6,7,-1,8,9,10,11,-1],solid=False,texCoordIndex=[0,1,2,3,-1,1,2,3,0,-1,4,5,6,7,-1],
        texCoord=TextureCoordinate(point=[(0.0,0.0),(0.0,8.0),(4.0,8.0),(4.0,0.0),(0.0,0.0),(4.0,0.0),(4.0,4.0),(0.0,4.0)]),
        coord=Coordinate(point=[(-1.0,-1.0,0.0),(-1.0,-1.0,-4.0),(-1.0,1.0,-4.0),(-1.0,1.0,0.0),(-1.0,-1.0,0.0),(1.0,-1.0,0.0),(1.0,-1.0,-4.0),(-1.0,-1.0,-4.0),(-1.0,-1.0,-4.0),(1.0,-1.0,-4.0),(1.0,1.0,-4.0),(-1.0,1.0,-4.0)]))),
    Transform(rotation=(0.0,1.0,0.0,1.571),translation=(-1.0,1.3,-2.0),
      children=[
      Shape(
        appearance=Appearance(),
        geometry=Text(string=["Time (sec)"],
          fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],size=0.4,style_='BOLD')))]),
    #  Create two moving cutting planes, one initially at the front and the other initially at the back. 
    ProtoInstance(name='SlidingPlane',
      fieldValue=[
      fieldValue(name='textures',
        children=[
        ImageTexture(url=["cp1.png","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/cp1.png"]),
        ImageTexture(url=["cp2.png","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/cp2.png"]),
        ImageTexture(url=["cp3.png","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/cp3.png"]),
        ImageTexture(url=["cp4.png","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/cp4.png"]),
        ImageTexture(url=["cp5.png","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/cp5.png"]),
        ImageTexture(url=["cp6.png","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/cp6.png"]),
        ImageTexture(url=["cp7.png","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/cp7.png"]),
        ImageTexture(url=["cp8.png","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/cp8.png"]),
        ImageTexture(url=["cp9.png","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/cp9.png"]),
        ImageTexture(url=["cp10.png","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/cp10.png"])]),
      fieldValue(name='minMaxX',value=(0.0,4.0)),
      fieldValue(name='initialX',value=0.0)]),
    ProtoInstance(name='SlidingPlane',
      fieldValue=[
      fieldValue(name='textures',
        children=[
        ImageTexture(url=["cp1.png","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/cp1.png"]),
        ImageTexture(url=["cp2.png","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/cp2.png"]),
        ImageTexture(url=["cp3.png","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/cp3.png"]),
        ImageTexture(url=["cp4.png","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/cp4.png"]),
        ImageTexture(url=["cp5.png","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/cp5.png"]),
        ImageTexture(url=["cp6.png","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/cp6.png"]),
        ImageTexture(url=["cp7.png","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/cp7.png"]),
        ImageTexture(url=["cp8.png","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/cp8.png"]),
        ImageTexture(url=["cp9.png","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/cp9.png"]),
        ImageTexture(url=["cp10.png","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/cp10.png"])]),
      fieldValue(name='minMaxX',value=(0.0,4.0)),
      fieldValue(name='initialX',value=3.6)])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for CutPlane.py:')
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

print("python CutPlane.py load and self-test diagnostics complete.")
