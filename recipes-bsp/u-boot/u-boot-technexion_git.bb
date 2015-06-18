require recipes-bsp/u-boot/u-boot.inc

DESCRIPTION = "U-Boot for TechNexion i.MX6 products"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=c7383a594871c03da76b3707929d2919"
DEPENDS = "u-boot-mkimage-native"
COMPATIBLE_MACHINE = "(picosom)"

PROVIDES = "u-boot"

PV = "v2014.10+git${SRCPV}"

SRCREV = "24c1d4dd4201e9efa487f27970b97db597736fba"
SRCBRANCH = "tn-mx6-patches-2014.10_3.10.53_1.1.0_ga"
 
SRC_URI = "git://github.com/technexion/u-boot-edm.git;branch=${SRCBRANCH}"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
