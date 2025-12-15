SUMMARY = "Firmware and hardware enablement for CM4-based phone"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS:${PN} = "\
  linux-firmware \
  linux-firmware-rpidistro \
  bluez-firmware-rpidistro \
"
