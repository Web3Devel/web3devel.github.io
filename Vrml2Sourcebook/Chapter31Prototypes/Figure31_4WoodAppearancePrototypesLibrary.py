####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Figure31_4WoodAppearancePrototypesLibrary.py
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
    meta(content='Figure31_4WoodAppearancePrototypesLibrary.x3d',name='title'),
    meta(content='Figure 31.4, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland',name='creator'),
    meta(content='http://www.wiley.com/legacy/compbooks/vrml2sbk/ch31/31fig04.htm',name='reference'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='31 October 2000',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='An external file containing an appearance library with wood appearances.',name='description'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter31Prototypes/Figure31_4WoodAppearancePrototypesLibrary.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='Figure31_4WoodAppearancePrototypesLibrary.x3d'),
    ProtoDeclare(name='DarkOak',
      ProtoInterface=ProtoInterface(
        field=[
        field(accessType='inputOutput',name='textureTransform',type='SFNode',
          #  NULL node as child 
          )]),
      ProtoBody=ProtoBody(
        children=[
        Appearance(DEF='DarkOakAppearance',
          #  textureTransform field IS exposed through the Prototype field interface with same name 
          IS=IS(
            connect=[
            connect(nodeField='textureTransform',protoField='textureTransform')]),
          material=Material(diffuseColor=(1,0.45,0.23)),
          texture=ImageTexture(DEF='wood_g_scope1',url=["../Chapter17Textures/wood_g.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter17Textures/wood_g.jpg"]))])),
    ProtoDeclare(name='LightOak',
      ProtoInterface=ProtoInterface(
        field=[
        field(accessType='inputOutput',name='textureTransform',type='SFNode',
          #  NULL node as child 
          )]),
      ProtoBody=ProtoBody(
        children=[
        Appearance(DEF='LightOakAppearance',
          #  textureTransform field IS exposed through the Prototype field interface with same name 
          IS=IS(
            connect=[
            connect(nodeField='textureTransform',protoField='textureTransform')]),
          material=Material(diffuseColor=(1,0.65,0.53)),
          #  Note that each prototype declaration has independent scope, and so DEF/USE is not possible for sharing. DEF remains a good way to identify the image file however. 
          texture=ImageTexture(DEF='wood_g_scope2',url=["../Chapter17Textures/wood_g.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter17Textures/wood_g.jpg"]))])),
    #  It is a good practice to include default message linking to an example scene, in case a user tries to view this Prototype library directly. 
    Anchor(description='Figure31_5WoodAppearanceExternalPrototypes link',url=["Figure31_5WoodAppearanceExternalPrototypes.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter31Prototypes/Figure31_5WoodAppearanceExternalPrototypes.x3d","Figure31_5WoodAppearanceExternalPrototypes.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter31Prototypes/Figure31_5WoodAppearanceExternalPrototypes.wrl"],
      children=[
      Shape(
        geometry=Text(string=["Figure31_4WoodAppearancePrototypesLibrary","contains prototype definitions","","Click on text to see these Appearances in","Figure31_5WoodAppearanceExternalPrototypes"],
          fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],size=0.5)),
        appearance=ProtoInstance(name='LightOak'))])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Figure31_4WoodAppearancePrototypesLibrary.py:')
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

print("python Figure31_4WoodAppearancePrototypesLibrary.py load and self-test diagnostics complete.")
