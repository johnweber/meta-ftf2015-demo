# copyright (c) 2015 Avnet Electronics

DESCRIPTION = "Wandboard Thermal Camera (WTC) helper scripts"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "git:///opt/git/wtc-scripts.git;branch=master"
SRCREV = "2cee1bddec3575f64890c18871a4ae1b506b33a1"

inherit autotools-brokensep

S = "${WORKDIR}/git"

FILES_${PN} += " \
    ${S}/allocate_gpio.sh \
    ${S}/allocate_gpio_pico.sh \
    ${S}/reset_lepton.sh \
    ${S}/reset_lepton_pico.sh \
"

do_install () {
	install -d ${D}${bindir}
	install -m 0755 ${S}/*.sh ${D}${bindir}
} 

PACKAGE_ARCH = "${MACHINE_ARCH}"
