####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Figure11_2CafeSignBillboard.py
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
    meta(content='Figure11_2CafeSignBillboard.x3d',name='title'),
    meta(content='Figure 11.2, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland',name='creator'),
    meta(content='http://www.wiley.com/legacy/compbooks/vrml2sbk/ch11/11fig02.htm',name='reference'),
    meta(content='Don Brutzman',name='transcriber'),
    meta(content='16 August 2000',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='A cafe sign within a billboard group.',name='description'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter11Grouping/Figure11_2CafeSignBillboard.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='Figure11_2CafeSignBillboard.x3d'),
    Viewpoint(description='Cafe sign Billboard entry view',orientation=(1,0,0,-0.2),position=(0,2,15)),
    #  Nesting a Viewpoint inside a Transform is a good way to precisely compose rotations about 2 different axes 
    Transform(rotation=(0,1,0,2.75),translation=(5,1.5,-15),
      children=[
      Viewpoint(description='Cafe sign Billboard view from corner',orientation=(1,0,0,-0.2))]),
    #  Steal an Inline node from the next chapter, instead of copying a bagful of nodes from preceding Figure 11.1 
    #  Cafe Sign in a Billboard group 
    Billboard(
      children=[
      Inline(url=["Figure11_1CafeSignSwitchResolutions.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter11Grouping/Figure11_1CafeSignSwitchResolutions.x3d","Figure11_1CafeSignSwitchResolutions.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter11Grouping/Figure11_1CafeSignSwitchResolutions.wrl"])]),
    #  Non-billboard sign pole and ground 
    Transform(DEF='POLE',translation=(0,-3.1,-0.1),
      children=[
      Shape(
        geometry=Box(size=(0.4,4,0.4)),
        appearance=Appearance(DEF='GREY_APPEARANCE',
          material=Material(diffuseColor=(0.6,0.6,0.6))))]),
    Transform(DEF='POLE_BASE',translation=(0,-5.2,-0.1),
      children=[
      Shape(
        geometry=Box(size=(1,0.2,1)),
        appearance=Appearance(USE='GREY_APPEARANCE'))]),
    Transform(DEF='GROUND',translation=(0,-5.35,-0.1),
      children=[
      Shape(
        geometry=Box(size=(10,0.1,10)),
        appearance=Appearance(USE='GREY_APPEARANCE'))])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Figure11_2CafeSignBillboard.py:')
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

print("python Figure11_2CafeSignBillboard.py load and self-test diagnostics complete.")
