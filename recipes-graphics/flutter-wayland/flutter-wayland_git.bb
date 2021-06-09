LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4fcc629d7a228e5e3e54c2fa1d73f774"

DEPENDS =+ "\
    libxkbcommon \
    flutter-engine \
    rapidjson \
    virtual/egl \
    wayland \
    waylandpp \
"

RDEPENDS_${PN} += "xkeyboard-config"

SRC_URI = "git://github.com/jwinarske/flutter_wayland;protocol=https;branch=waylandpp"
SRCREV = "139d58614408308c414e476bae82a5bf91ae8d44"

REQUIRED_DISTRO_FEATURES = "wayland"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE = " \
    -DCMAKE_VERBOSE_MAKEFILE=TRUE \
    -DFLUTTER_ENGINE_LIBRARY=${STAGING_LIBDIR}/libflutter_engine.so \
    "

FILES_${PN}  = "${bindir}/flutter_wayland"
