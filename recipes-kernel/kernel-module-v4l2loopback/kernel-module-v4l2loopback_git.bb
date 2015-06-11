SUMMARY = "v4l2loopback kernel module"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

PROVIDES = "virtual/kernel-module-v4l2loopback"
RPROVIDES_${PN} = "virtual/kernel-module-v4l2loopback"
RPROVIDES_${PN}-dev = "virtual/kernel-module-v4l2loopback"

inherit module

SRC_URI = " \
    git://github.com/umlaeute/v4l2loopback.git;protocol=git;branch=${SRCBRANCH} \
    file://0001-Makefile-Use-KERNEL_SRC-and-KERNEL_VERSION.patch \
    file://0002-Makefile-add-modules_install-target-and-remove-depmo.patch \
"

SRCBRANCH = "master"
SRCREV = "56cc11d175b6cfdf33ed03ccd8368cb837d3992c"

S = "${WORKDIR}/git"


COMPATIBLE_MACHINE = "(mx6)"
