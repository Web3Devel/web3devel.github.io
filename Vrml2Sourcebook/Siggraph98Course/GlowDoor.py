####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python GlowDoor.py
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

newModel=X3D(profile='Interchange',version='3.3',
  head=head(
    children=[
    meta(content='GlowDoor.x3d',name='title'),
    meta(content='Glowing Door: this file creates a simple arched-top door, glowing with a white light. The door is used in the doorway.wrl example.',name='description'),
    meta(content='David R. Nadeau',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='Doorway.x3d',name='reference'),
    meta(content='originals/glowdoor.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0383.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/GlowDoor.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='GlowDoor.x3d'),
    Shape(
      appearance=Appearance(
        textureTransform=TextureTransform(scale=(0.7,1.0),translation=(0.1,0.1)),
        texture=ImageTexture(url=["fire_g.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/fire_g.jpg"])),
      geometry=IndexedFaceSet(coordIndex=[0,1,2,3,4,5,6,7,8,9,10,-1,21,20,19,18,17,16,15,14,13,12,11,-1,0,11,12,1,-1,1,12,13,2,-1,2,13,14,3,-1,3,14,15,4,-1,4,15,16,5,-1,5,16,17,6,-1,6,17,18,7,-1,7,18,19,8,-1,8,19,20,9,-1,9,20,21,10,-1],
        coord=Coordinate(point=[(1.5,0.0,0.01),(1.5,4.5,0.01),(1.39,5.07,0.01),(1.06,5.56,0.01),(0.57,5.89,0.01),(0.0,6.0,0.01),(-0.57,5.89,0.01),(-1.06,5.56,0.01),(-1.39,5.07,0.01),(-1.5,4.5,0.01),(-1.5,0.0,0.0),(1.5,0.0,-0.41),(1.5,4.5,-0.41),(1.39,5.07,-0.41),(1.06,5.56,-0.41),(0.57,5.89,-0.41),(0.0,6.0,-0.41),(-0.57,5.89,-0.41),(-1.06,5.56,-0.41),(-1.39,5.07,-0.41),(-1.5,4.5,-0.41),(-1.5,0.0,-0.4)]))),
    Shape(
      appearance=Appearance(
        material=Material(diffuseColor=(0.2,0.2,0.2))),
      geometry=IndexedFaceSet(coordIndex=[0,1,2,3,-1,4,12,13,5,-1,5,13,14,6,-1,6,14,15,7,-1,8,4,5,9,-1,9,5,6,10,-1,10,6,7,11,-1,16,17,13,12,-1,17,18,14,13,-1,18,19,15,14,-1],solid=False,
        coord=Coordinate(point=[(1.3,2.2,0.02),(1.3,3.2,0.02),(0.9,3.2,0.02),(0.9,2.2,0.02),(1.15,3.1,0.02),(1.15,2.9,0.2),(1.15,2.5,0.2),(1.15,2.3,0.02),(1.15,3.0,0.02),(1.15,2.85,0.13),(1.15,2.55,0.13),(1.15,2.4,0.02),(1.05,3.1,0.02),(1.05,2.9,0.2),(1.05,2.5,0.2),(1.05,2.3,0.02),(1.05,3.0,0.02),(1.05,2.85,0.13),(1.05,2.55,0.13),(1.05,2.4,0.02)])))])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for GlowDoor.py:')
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

print("python GlowDoor.py load and self-test diagnostics complete.")
