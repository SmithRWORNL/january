/**
 * generated by Xtext 2.10.0
 */
package org.eclipse.january.geometry.xtext.vtk;

import org.eclipse.january.geometry.xtext.vtk.VTKStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class VTKStandaloneSetup extends VTKStandaloneSetupGenerated {
  public static void doSetup() {
    VTKStandaloneSetup _vTKStandaloneSetup = new VTKStandaloneSetup();
    _vTKStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}