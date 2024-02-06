####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Figure12_1SimpleArch.py
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

newModel=X3D(profile='Interchange',version='3.0',
  head=head(
    children=[
    meta(content='Figure12_1SimpleArch.x3d',name='title'),
    meta(content='Figure 12.1, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland',name='creator'),
    meta(content='http://www.wiley.com/legacy/compbooks/vrml2sbk/ch12/12fig01.htm',name='reference'),
    meta(content='Don Brutzman',name='transcriber'),
    meta(content='9 October 2000',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='A simple arch. Also see Figures 6.10, 7.11, 12.1, 12.2 and 12.3 for comparison.',name='description'),
    meta(content='../Chapter06RotatingShapes/Figure06_10SimpleArch.x3d',name='reference'),
    meta(content='../Chapter07ScalingShapes/Figure07_11ScaledArches.x3d',name='reference'),
    meta(content='Figure12_2InlinedArches.x3d',name='reference'),
    meta(content='Figure12_3TempleOfInlinedArches.x3d',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter12Inline/Figure12_1SimpleArch.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../../license.html',name='license')]),
  Scene=Scene(
    #  Having NavigationInfo here is usually OK since it will get superceded by NavigationInfo nodes in parent scenes 
    #  No viewpoint in this base scene, since we do not want them to accumulate 
    children=[
    WorldInfo(title='Figure12_1SimpleArch.x3d'),
    Group(
      children=[
      Transform(translation=(-2,3,0),
        children=[
        Shape(DEF='COLUMN',
          geometry=Cylinder(height=6,radius=0.3),
          appearance=Appearance(DEF='GREY_SPECULAR_SHINY',
            material=Material(diffuseColor=(0.75,0.75,0.75),shininess=0.8,specularColor=(0.8,0.8,0.8))))]),
      Transform(translation=(2,3,0),
        children=[
        Shape(USE='COLUMN')]),
      Transform(translation=(0,6.05,0),
        children=[
        Shape(
          appearance=Appearance(USE='GREY_SPECULAR_SHINY'),
          geometry=Box(size=(4.6,0.4,0.6)))]),
      Transform(DEF='LEFT_ROOF_TRANSFORM',rotation=(0,0,1,0.524),translation=(-1.15,7.12,0),
        children=[
        Shape(DEF='LEFT_ROOF_SHAPE',
          appearance=Appearance(USE='GREY_SPECULAR_SHINY'),
          geometry=Box(size=(2.86,0.4,0.6)))]),
      Transform(DEF='RIGHT_ROOF_TRANSFORM',rotation=(0,0,1,-0.524),translation=(1.15,7.12,0),
        children=[
        Shape(USE='LEFT_ROOF_SHAPE')])])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Figure12_1SimpleArch.py:')
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

print("python Figure12_1SimpleArch.py load and self-test diagnostics complete.")
