require 'ffi'

module MSVCrt

  extend FFI::Library
  ffi_lib        'msvcrt'
  ffi_convention :stdcall
  
  # int sprintf(
   # char *buffer,
   # const char *format [,
   # argument] ... 
  
end