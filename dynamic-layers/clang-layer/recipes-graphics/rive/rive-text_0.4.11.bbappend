DEPENDS += "\
    compiler-rt \
    libcxx \
"

# Toolchain setup
RUNTIME = "llvm"
TOOLCHAIN = "clang"
PREFERRED_PROVIDER_libgcc = "compiler-rt"
LIBCPLUSPLUS = "-stdlib=libc++"

do_install:append() {
    # Move files from /usr/lib to /usr/lib64, as cmake installs them to the wrong directory.
    mkdir -p ${D}/${libdir}
    mv ${D}/usr/lib/* ${D}/${libdir}/
    rmdir ${D}/usr/lib
}
