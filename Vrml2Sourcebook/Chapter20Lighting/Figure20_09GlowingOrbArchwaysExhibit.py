####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Figure20_09GlowingOrbArchwaysExhibit.py
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

newModel=X3D(profile='Interactive',version='3.0',
  head=head(
    children=[
    meta(content='Figure20_09GlowingOrbArchwaysExhibit.x3d',name='title'),
    meta(content='Figure 20.9, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland',name='creator'),
    meta(content='http://www.wiley.com/legacy/compbooks/vrml2sbk/ch20/20fig09.htm',name='reference'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='Colleen Case',name='translator'),
    meta(content='4 November 2000',name='created'),
    meta(content='1 July 2023',name='modified'),
    meta(content='A glowing sphere within a gothic building.',name='description'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter20Lighting/Figure20_09GlowingOrbArchwaysExhibit.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='Figure20_09GlowingOrbArchwaysExhibit.x3d'),
    Group(
      children=[
      Inline(DEF='VAULT',bboxCenter=(0,1,0),bboxSize=(6,2,6),url=["../Chapter13PointsLinesFaces/Figure13_16VaultedCeiling.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter13PointsLinesFaces/Figure13_16VaultedCeiling.x3d","../Chapter13PointsLinesFaces/Figure13_16VaultedCeiling.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter13PointsLinesFaces/Figure13_16VaultedCeiling.wrl"]),
      Transform(translation=(-8.25,0.0,-8.25),
        children=[
        Shape(
          geometry=ElevationGrid(creaseAngle=0.2,height=[0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0],solid=False,xDimension=12,xSpacing=1.5,zDimension=12,zSpacing=1.5),
          appearance=Appearance(
            material=Material(diffuseColor=(0.6,0.4,0))))]),
      Transform(DEF='GLOBE_TRANSFORM',translation=(0,1,0),
        children=[
        PointLight(DEF='GLOBELIGHT',ambientIntensity=0.2,color=(0.7,0.5,0),radius=15),
        Shape(
          appearance=Appearance(
            texture=ImageTexture(url=["fire.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter20Lighting/fire.jpg"]),
            textureTransform=TextureTransform(DEF='FIRE_TEXTURETRANSFORM')),
          geometry=Sphere(radius=0.2)),
        Viewpoint(description='hello orb',position=(0,0,3)),
        TimeSensor(DEF='SPINCLOCK',cycleInterval=30,loop=True),
        ScalarInterpolator(DEF='TEXTURE_SPIN_INTERPOLATOR',key=[0,0.5,1],keyValue=[0,-3.14159,-6.28318]),
        ScalarInterpolator(DEF='LIGHT_INTENSITY_TWEAKER',key=[0,0.2,0.35,0.5,0.65,0.85,0.95,1],keyValue=[1,0.7,0.3,0.5,0.75,0.85,0.4,1])]),
      Shape(
        appearance=Appearance(DEF='WHITE',
          material=Material(diffuseColor=(0.5,0.5,0.5),emissiveColor=(0.1,0.1,0.1))),
        geometry=IndexedFaceSet(coordIndex=[0,1,4,-1,1,2,4,-1,2,3,4,-1,3,0,4,-1],
          coord=Coordinate(point=[(-0.12,0.03,0.12),(0.12,0.03,0.12),(0.12,0.03,-0.12),(-0.12,0.03,-0.12),(0.0,0.63,0.0)]))),
      Transform(translation=(0,0.015,0),
        children=[
        Shape(
          appearance=Appearance(USE='WHITE'),
          geometry=Box(size=(0.4,0.03,0.4)))])]),
    ROUTE(fromField='fraction_changed',fromNode='SPINCLOCK',toField='set_fraction',toNode='TEXTURE_SPIN_INTERPOLATOR'),
    ROUTE(fromField='value_changed',fromNode='TEXTURE_SPIN_INTERPOLATOR',toField='set_rotation',toNode='FIRE_TEXTURETRANSFORM'),
    ROUTE(fromField='fraction_changed',fromNode='SPINCLOCK',toField='set_fraction',toNode='LIGHT_INTENSITY_TWEAKER'),
    ROUTE(fromField='value_changed',fromNode='LIGHT_INTENSITY_TWEAKER',toField='set_intensity',toNode='GLOBELIGHT')])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Figure20_09GlowingOrbArchwaysExhibit.py:')
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

print("python Figure20_09GlowingOrbArchwaysExhibit.py load and self-test diagnostics complete.")
