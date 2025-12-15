SUMMARY = "OTA / Mender client"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS:${PN} = "\
  mender-client \
"
