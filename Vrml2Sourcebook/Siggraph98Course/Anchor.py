###############################################
#
# Now available: developmental python x3d.py package on PyPi for import.
#   This approach greatly simplifies Python X3D deployment and use.
#   https://pypi.org/project/x3d
#
# Installation:
#       pip install x3d
# or
#       python -m pip install x3d
#
# Developer options for loading x3d package:
#
#    from x3d import *  # preferred approach, terser source that avoids x3d.* class prefixes
#
# or
#    import x3d         # traditional way to subclass x3d package, all classes require x3d.* prefix
#                       # but python source is very verbose, for example x3d.Material x3d.Shape etc.
#                       # X3dToPython.xslt stylesheet insertPackagePrefix=true supports this option.

from x3d import *

###############################################

newModel=X3D(profile='Interactive',version='3.3',
  head=head(
    children=[
    meta(content='Anchor.x3d',name='title'),
    meta(content='Simple anchor example illustrates the use of an Anchor link around the shapes used to build a door. Clicking on the door jumps you to a new world, the Stairway.',name='description'),
    meta(content='David R. Nadeau',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='Stairway.x3d',name='reference'),
    meta(content='originals/anchor.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0095.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Anchor.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    #  Things to experiment with: 
    #  Change the anchor's URL to point to one of your own worlds. 
    #  Add more doors and stairs. Add walls, floor, ceiling, etc. 
    children=[
    WorldInfo(title='Anchor.x3d'),
    Transform(translation=(0.0,-2.5,0.0),
      children=[
      Shape(DEF='Stair',
        appearance=Appearance(
          material=Material(diffuseColor=(1.0,1.0,1.0))),
        geometry=Box(size=(4.0,0.25,1.0))),
      Transform(translation=(0.0,0.5,-1.0),
        children=[
        Shape(USE='Stair')]),
      Transform(translation=(0.0,1.0,-2.0),
        children=[
        Shape(USE='Stair')]),
      Transform(translation=(0.0,4.125,-2.6),
        children=[
        Anchor(description='Twisty Stairs',url=["Stairway.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Stairway.x3d","Stairway.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Stairway.wrl"],
          children=[
          Shape(
            appearance=Appearance(
              material=Material(diffuseColor=(0.6,0.4,0.0))),
            geometry=Box(size=(3.0,6.0,0.2))),
          Transform(translation=(1.18,-0.0,0.2),
            children=[
            Shape(
              appearance=Appearance(
                material=Material(diffuseColor=(0.3,0.3,0.3))),
              geometry=Sphere(radius=0.15))])])])])])
) # X3D model complete

###############################################
# Self-test diagnostics
###############################################

if        metaDiagnostics(newModel): # built-in utility method in X3D class
    print(metaDiagnostics(newModel))
print('checking newModel.toXML() serialization...')
newModelXML = newModel.toXML() # test toXML() for exceptions
# print(newModelXML) # debug

print ("python x3d.py load successful for Anchor.py")
