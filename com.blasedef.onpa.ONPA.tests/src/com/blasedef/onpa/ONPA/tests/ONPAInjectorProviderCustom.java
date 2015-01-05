package com.blasedef.onpa.ONPA.tests;

import com.blasedef.onpa.ONPAInjectorProvider;
import com.blasedef.onpa.ONPARuntimeModule;
import com.blasedef.onpa.ONPAStandaloneSetup;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class ONPAInjectorProviderCustom extends ONPAInjectorProvider {
	
	@Override
    protected Injector internalCreateInjector() {
        return new ONPAStandaloneSetup() {
            @Override
            public Injector createInjector() {
                return Guice.createInjector(new ONPARuntimeModule() {
                    // this is required only by the CompilationTestHelper since
                    // Xtext 2.7
                    @SuppressWarnings("unused")
                    public Class<? extends org.eclipse.xtend.lib.macro.file.MutableFileSystemSupport> bindMutableFileSystemSupport() {
                        return org.eclipse.xtext.xbase.file.JavaIOFileSystemSupport.class;
                    }

                    // this is required only by the CompilationTestHelper since
                    // Xtext 2.7
                    @SuppressWarnings("unused")
                    public Class<? extends com.google.inject.Provider<org.eclipse.xtext.xbase.file.WorkspaceConfig>> provideWorkspaceConfig() {
                        return org.eclipse.xtext.xbase.file.RuntimeWorkspaceConfigProvider.class;
                    }
                });
            }
        }.createInjectorAndDoEMFRegistration();
    }

}
