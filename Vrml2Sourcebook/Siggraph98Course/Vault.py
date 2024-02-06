####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Vault.py
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
    meta(content='Vault.x3d',name='title'),
    meta(content='Gothic vaulted ceiling archway: this file builds a piece of a vaulted ceiling using an IndexedFaceSet node. This piece is then used to build a full ceiling in ceiling.wrl, and finally a full building in temple.wrl.',name='description'),
    meta(content='David R. Nadeau',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='Ceiling.x3d',name='reference'),
    meta(content='Temple.x3d',name='reference'),
    meta(content='originals/vault.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0008.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0309.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0383.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Vault.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='Vault.x3d'),
    Collision(enabled=False,
      children=[
      Shape(
        appearance=Appearance(
          textureTransform=TextureTransform(scale=(4.0,4.0)),
          material=Material(DEF='StoneMaterial',diffuseColor=(1.0,1.0,1.0)),
          texture=ImageTexture(DEF='StoneBrick',url=["stonebrk.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/stonebrk.jpg"])),
        geometry=IndexedFaceSet(ccw=False,coordIndex=[0,13,14,1,-1,1,14,15,2,-1,2,15,16,3,-1,3,16,17,4,-1,4,17,18,5,-1,5,18,19,6,-1,6,19,20,7,-1,7,20,21,8,-1,8,21,22,9,-1,9,22,23,10,-1,10,23,24,11,-1,11,24,25,12,-1],creaseAngle=0.785,
          coord=Coordinate(point=[(-1.1,0.0,1.0),(-1.1,0.26,0.97),(-1.1,0.5,0.87),(-1.1,0.71,0.71),(-1.1,0.87,0.5),(-1.1,0.97,0.26),(-1.1,1.0,0.0),(-1.1,0.97,-0.26),(-1.1,0.87,-0.5),(-1.1,0.71,-0.71),(-1.1,0.5,-0.87),(-1.1,0.26,-0.97),(-1.1,0.0,-1.0),(-1.0,0.0,1.0),(-0.97,0.26,0.97),(-0.87,0.5,0.87),(-0.71,0.71,0.71),(-0.5,0.87,0.5),(-0.26,0.96,0.26),(0.0,1.0,0.0),(-0.26,0.96,-0.26),(-0.5,0.87,-0.5),(-0.71,0.71,-0.71),(-0.87,0.5,-0.87),(-0.97,0.26,-0.97),(-1.0,0.0,-1.0)]))),
      Transform(translation=(-1.0,0.0,0.0),
        children=[
        Shape(
          appearance=Appearance(
            textureTransform=TextureTransform(),
            material=Material(USE='StoneMaterial'),
            texture=ImageTexture(url=["stone2.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/stone2.jpg"])),
          geometry=IndexedFaceSet(convex=False,coordIndex=[0,16,17,1,-1,1,17,18,2,-1,2,18,19,3,-1,3,19,20,4,-1,4,20,21,5,-1,5,21,22,6,-1,6,22,23,7,-1,24,8,9,25,-1,25,9,10,26,-1,26,10,11,27,-1,27,11,12,28,-1,28,12,13,29,-1,29,13,14,30,-1,30,14,15,31,-1,8,0,1,9,-1,9,1,2,10,-1,10,2,3,11,-1,11,3,4,12,-1,12,4,5,13,-1,13,5,6,14,-1,14,6,7,15,-1,16,24,25,17,-1,17,25,26,18,-1,18,26,27,19,-1,19,27,28,20,-1,20,28,29,21,-1,21,29,30,22,-1,22,30,31,23,-1,0,8,24,16,-1,7,23,31,15,-1],creaseAngle=0.785,texCoordIndex=[0,1,2,3,-1,0,1,2,3,-1,0,1,2,3,-1,0,1,2,3,-1,0,1,2,3,-1,0,1,2,3,-1,0,1,2,3,-1,0,1,2,3,-1,0,1,2,3,-1,0,1,2,3,-1,0,1,2,3,-1,0,1,2,3,-1,0,1,2,3,-1,0,1,2,3,-1,0,1,2,3,-1,0,1,2,3,-1,0,1,2,3,-1,0,1,2,3,-1,0,1,2,3,-1,0,1,2,3,-1,0,1,2,3,-1,0,1,2,3,-1,0,1,2,3,-1,0,1,2,3,-1,0,1,2,3,-1,0,1,2,3,-1,0,1,2,3,-1,0,1,2,3,-1,0,1,2,3,-1,0,1,2,3,-1],
            texCoord=TextureCoordinate(point=[(0.0,0.0),(1.0,0.0),(1.0,1.0),(0.0,1.0)]),
            coord=Coordinate(point=[(0.0,0.0,-0.9),(0.0,0.39,-0.81),(0.0,0.7,-0.56),(0.0,0.88,-0.2),(0.0,0.88,0.2),(0.0,0.7,0.56),(0.0,0.39,0.81),(0.0,0.0,0.9),(-0.1,0.0,-0.9),(-0.1,0.39,-0.81),(-0.1,0.7,-0.56),(-0.1,0.88,-0.2),(-0.1,0.88,0.2),(-0.1,0.7,0.56),(-0.1,0.39,0.81),(-0.1,0.0,0.9),(0.0,0.0,-1.0),(0.0,0.43,-0.9),(0.0,0.78,-0.62),(0.0,0.97,-0.22),(0.0,0.97,0.22),(0.0,0.78,0.62),(0.0,0.43,0.9),(0.0,0.0,1.0),(-0.1,0.0,-1.0),(-0.1,0.43,-0.9),(-0.1,0.78,-0.62),(-0.1,0.97,-0.22),(-0.1,0.97,0.22),(-0.1,0.78,0.62),(-0.1,0.43,0.9),(-0.1,0.0,1.0)])))])])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Vault.py:')
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

print("python Vault.py load and self-test diagnostics complete.")
