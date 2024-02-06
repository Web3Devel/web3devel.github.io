####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Figure20_16SpotLightBeamWidthComparison.py
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
    meta(content='Figure20_16SpotLightBeamWidthComparison.x3d',name='title'),
    meta(content='Figure 20.16, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland',name='creator'),
    meta(content='http://www.wiley.com/legacy/compbooks/vrml2sbk/ch20/20fig16a.htm',name='reference'),
    meta(content='http://www.wiley.com/legacy/compbooks/vrml2sbk/ch20/20fig16b.htm',name='reference'),
    meta(content='http://www.wiley.com/legacy/compbooks/vrml2sbk/ch20/20fig16c.htm',name='reference'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='10 September 2000',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='Three meshes illuminated by separate spotlights, with outer cone set to 45 degrees and inner cones set to 45, 22 1/2, and 1/2 degrees respectively. Combines Figures 20.16a, 16b, 16c.',name='description'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter20Lighting/Figure20_16SpotLightBeamWidthComparison.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='Figure20_16SpotLightBeamWidthComparison.x3d'),
    Viewpoint(description='SpotLights shining on meshes, outer cone 45 degrees. Inner cone varies 90 to 45 to 5 degrees.',orientation=(1,0,0,-0.52),position=(0,24,48)),
    Viewpoint(description='SpotLight beam differences are more pronounced at narrow angles',orientation=(1,0,0,-0.157),position=(0,8,48)),
    #  Note headlight turned off in NavigationInfo. Most browsers allow user toggling headlight also. 
    #  This NavigationInfo node is bound at runtime and overrides the NavigationInfo headlight setting within the Inlined scene. 
    #  Check out the scene with headlight off 
    Transform(translation=(-21,0,0),
      children=[
      SpotLight(ambientIntensity=0.5,beamWidth=0.785,cutOffAngle=0.785,direction=(0,-1,0),location=(0,9,0),radius=12),
      Inline(DEF='FlatMesh',bboxSize=(16,16,16),url=["Figure20_05FlatMesh.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter20Lighting/Figure20_05FlatMesh.x3d","Figure20_05FlatMesh.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter20Lighting/Figure20_05FlatMesh.wrl"])]),
    Group(
      children=[
      SpotLight(ambientIntensity=0.5,beamWidth=0.392,cutOffAngle=0.785,direction=(0,-1,0),location=(0,9,0),radius=12),
      Inline(USE='FlatMesh')]),
    Transform(translation=(21,0,0),
      children=[
      SpotLight(ambientIntensity=0.5,beamWidth=0.09,cutOffAngle=0.785,direction=(0,-1,0),location=(0,9,0),radius=12),
      Inline(USE='FlatMesh')])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Figure20_16SpotLightBeamWidthComparison.py:')
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

print("python Figure20_16SpotLightBeamWidthComparison.py load and self-test diagnostics complete.")